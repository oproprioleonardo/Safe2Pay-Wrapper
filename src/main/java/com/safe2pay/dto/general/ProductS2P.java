package com.safe2pay.dto.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductS2P {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("UnitPrice")
    private double unitPrice;
    @JsonProperty("Quantity")
    private double quantity;

    public ProductS2P() {
    }

    @Builder
    public ProductS2P(String code, String Description, double UnitPrice, double Quantity) {
        this.code = code;
        this.description = Description;
        this.unitPrice = UnitPrice;
        this.quantity = Quantity;
    }
     

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.unitPrice = UnitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double Quantity) {
        this.quantity = Quantity;
    }
}
