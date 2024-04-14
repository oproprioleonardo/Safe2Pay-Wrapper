package com.safe2pay.dto.response.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PixResponseDetail extends ResponseDetail {

    @JsonProperty("QrCode")
    private String qrCode;
    @JsonProperty("Key")
    private String key;

    public PixResponseDetail(String idTransaction, Integer status, String message, String description, String qrCode,
                             String key) {
        super(idTransaction, status, message, description);
        this.qrCode = qrCode;
        this.key = key;
    }

    public PixResponseDetail() {
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
