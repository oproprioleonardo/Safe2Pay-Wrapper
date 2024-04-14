package com.safe2pay.dto.response.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCardResponseDetail extends ResponseDetail {

    @JsonProperty("Tid")
    private String tid;
    @JsonProperty("AuthorizationCode")
    private String authorizationCode;
    @JsonProperty("Token")
    private String token;
    @JsonProperty("CreditCard")
    private CreditCard creditCard;

    @Builder
    public CreditCardResponseDetail(String idTransaction, Integer status, String message, String description, String tid, String authorizationCode, String token, CreditCard creditCard) {
        super(idTransaction, status, message, description);
        this.tid = tid;
        this.authorizationCode = authorizationCode;
        this.token = token;
        this.creditCard = creditCard;
    }

    public CreditCardResponseDetail() {
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record CreditCard(
            @JsonProperty("CardNumber")
            String cardNumber,
            @JsonProperty("Brand")
            Integer brand,
            @JsonProperty("Installments")
            Integer installments,
            @JsonProperty("ReturnCode")
            String returnCode,
            @JsonProperty("MessageProvider")
            String messageProvider
    ) {
    }
}
