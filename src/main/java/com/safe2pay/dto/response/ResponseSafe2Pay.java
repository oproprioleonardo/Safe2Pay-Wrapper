package com.safe2pay.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseSafe2Pay<T> {

    @JsonProperty("HasError")
    private boolean hasError;
    @JsonProperty("ErrorCode")
    private int errorCode;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("ResponseDetail")
    private T responseDetail;

    public void setError(String error) {
        this.error = error;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getError() {
        return error;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public T getResponseDetail() {
        return responseDetail;
    }

    public void setResponseDetail(T responseDetail) {
        this.responseDetail = responseDetail;
    }
}

