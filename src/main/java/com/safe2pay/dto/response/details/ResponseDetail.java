package com.safe2pay.dto.response.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDetail {

    @JsonProperty("IdTransaction")
    private String idTransaction;
    @JsonProperty("Status")
    private Integer status;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Description")
    private String description;

    public ResponseDetail(String idTransaction, Integer status, String message, String description) {
        this.idTransaction = idTransaction;
        this.status = status;
        this.message = message;
        this.description = description;
    }

    public ResponseDetail() {
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
