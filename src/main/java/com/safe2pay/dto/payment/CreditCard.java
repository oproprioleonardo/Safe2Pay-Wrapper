package com.safe2pay.dto.payment;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {

    @JsonProperty("Holder")
    private String holder;
    @JsonProperty("CardNumber")
    private String cardNumber;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("SecurityCode")
    private String securityCode;
    @JsonProperty("Token")
    private String token;
    @JsonProperty("InstallmentQuantity")
    private int installmentQuantity;
    @JsonProperty("IsCancelled")
    private boolean isCancelled;
    @JsonProperty("IsApplyInterest")
    private boolean isApplyInterest;
    @JsonProperty("InterestRate")
    private double interestRate;
    @JsonProperty("IsPreAuthorization")
    private boolean isPreAuthorization;


    @Builder
    public CreditCard(String holder, String cardNumber, String expirationDate, String securityCode, String token, int installmentQuantity, boolean isCancelled, boolean isApplyInterest, double interestRate, boolean isPreAuthorization) {
        this.holder = holder;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.token = token;
        this.installmentQuantity = installmentQuantity;
        this.isCancelled = isCancelled;
        this.isApplyInterest = isApplyInterest;
        this.interestRate = interestRate;
        this.isPreAuthorization = isPreAuthorization;
    }

    public CreditCard() {
    }

}
