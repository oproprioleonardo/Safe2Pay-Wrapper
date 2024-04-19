package com.safe2pay.dto.response.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.safe2pay.dto.general.ProductS2P;
import com.safe2pay.dto.general.address.TransactionAddressS2P;
import com.safe2pay.dto.general.customer.CustomerS2P;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionResponseDetail {

    @JsonProperty("IdTransaction")
    private int idTransaction;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Application")
    private String application;
    @JsonProperty("Vendor")
    private String vendor;
    @JsonProperty("Reference")
    private String reference;
    @JsonProperty("PaymentDate")
    private String paymentDate;
    @JsonProperty("PaymentDateTime")
    private String paymentDateTime;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("CreatedDateTime")
    private String createdDateTime;
    @JsonProperty("Amount")
    private float amount;
    @JsonProperty("NetValue")
    private float netValue;
    @JsonProperty("DiscountAmount")
    private float discountAmount;
    @JsonProperty("TaxValue")
    private float taxValue;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
    @JsonProperty("AmountPayment")
    private float amountPayment;
    @JsonProperty("Customer")
    private CustomerS2P customer;
    @JsonProperty("Address")
    private TransactionAddressS2P address;
    @JsonProperty("Products")
    private List<ProductS2P> products;
    @JsonProperty("PaymentObject")
    private Object paymentObject;


}
