package com.safe2pay;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safe2pay.dto.response.ResponseSafe2Pay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public final class Client {

    private static String apiKey = "";

    public static void setToken(String token) {
        apiKey = token;
    }

    public static <T> ResponseSafe2Pay<T> makeCallToApi(String method, String endpoint, Object body, boolean IsPayment, Class<T> clazz) {
        try {
            System.setProperty("https.protocols", "TLSv1.2");

            // Monta endpoint da requisição
            final HttpURLConnection con = getHttpURLConnection(method, endpoint, IsPayment);

            // Adiciona o Body nas requisições
            if (Objects.equals(method, "POST") || Objects.equals(method, "PUT")) {
                if (body != null) {
                    final ObjectMapper mapper = new ObjectMapper();

                    mapper.setSerializationInclusion(Include.NON_NULL);
                    mapper.setVisibility(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                            .withFieldVisibility(JsonAutoDetect.Visibility.NONE)
                            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));

                    final String payload = mapper.writeValueAsString(body);

                    try (OutputStream os = con.getOutputStream()) {
                        byte[] input = payload.getBytes(StandardCharsets.UTF_8);
                        os.write(input, 0, input.length);
                    }
                }
            }

            // Faz Leitura no buffer de resposta
            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            final StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            final JsonNode jsonNode = new ObjectMapper().readTree(response.toString());
            final boolean hasError = jsonNode.get("HasError").asBoolean();
            if (hasError) {
                final ResponseSafe2Pay<T> responseSafe2Pay = new ResponseSafe2Pay<>();
                responseSafe2Pay.setHasError(true);
                responseSafe2Pay.setError(jsonNode.get("Error").asText());
                responseSafe2Pay.setErrorCode(jsonNode.get("ErrorCode").asInt());
                return responseSafe2Pay;
            }
            final String responseDetailJson = jsonNode.get("ResponseDetail").toString();
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
            mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
            mapper.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
            final T responseDetail = new ObjectMapper().readValue(responseDetailJson, clazz);
            final ResponseSafe2Pay<T> responseSafe2Pay = new ResponseSafe2Pay<>();
            responseSafe2Pay.setHasError(false);
            responseSafe2Pay.setResponseDetail(responseDetail);
            return responseSafe2Pay;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static HttpURLConnection getHttpURLConnection(String method, String endpoint, boolean IsPayment) throws IOException {
        final URL obj = new URL(getBaseUrl(IsPayment).concat(endpoint));
        // Abre conexão com o endpoint
        final HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // Adiciona o WebMethod
        con.setRequestMethod(method);
        // Adiciona os Headers da requisição
        con.setRequestProperty("X-API-KEY", apiKey);
        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        con.setDoInput(true);
        return con;
    }

    private static String getBaseUrl(boolean IsPayment) {
        return !IsPayment ? "https://api.safe2pay.com.br/" : "https://payment.safe2pay.com.br/";
    }

}
