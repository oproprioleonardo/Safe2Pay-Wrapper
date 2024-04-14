package com.safe2pay.dto.transactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionStatus {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Name")
    private String name;

    @Builder
    public TransactionStatus(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public TransactionStatus() {
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
}
