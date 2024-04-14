package com.safe2pay.dto.response.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankSlipResponseDetail extends ResponseDetail {

    @JsonProperty("BankSlipNumber")
    private String bankSlipNumber;
    @JsonProperty("BankSlipUrl")
    private String bankSlipUrl;
    @JsonProperty("DueDate")
    private String dueDate;
    @JsonProperty("Barcode")
    private String barcode;
    @JsonProperty("DigitableLine")
    private String digitableLine;
    @JsonProperty("OperationDate")
    private String operationDate;
    @JsonProperty("BankName")
    private String bankName;
    @JsonProperty("CodeBank")
    private String codeBank;
    @JsonProperty("Wallet")
    private String wallet;
    @JsonProperty("SeedNumber")
    private String seedNumber;
    @JsonProperty("WalletDescription")
    private String walletDescription;
    @JsonProperty("Agency")
    private String agency;
    @JsonProperty("Account")
    private String account;
    @JsonProperty("CodeAssignor")
    private String codeAssignor;
    @JsonProperty("KeyPix")
    private String keyPix;
    @JsonProperty("QrCodePix")
    private String qrCodePix;
    @JsonProperty("AgencyDV")
    private String agencyDV;
    @JsonProperty("AccountDV")
    private String accountDV;
    @JsonProperty("DocType")
    private String docType;
    @JsonProperty("Accept")
    private String accept;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("GuarantorName")
    private String guarantorName;
    @JsonProperty("GuarantorIdentity")
    private String guarantorIdentity;
    @JsonProperty("CodeBeneficiary")
    private String codeBeneficiary;


}
