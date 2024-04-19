package com.safe2pay.dto.general.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionCustomerS2P {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Identity")
    private String identity;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Address")
    private TransactionCustomerS2P address;

    public TransactionCustomerS2P() {
    }

    public TransactionCustomerS2P(String Name, String Identity, String Email) {
        this.name = Name;
        this.identity = Identity;
        this.email = Email;
    }

    @Builder
    public TransactionCustomerS2P(String Name, String Identity, String Phone, String Email, TransactionCustomerS2P Address) {
        this.name = Name;
        this.identity = Identity;
        this.phone = Phone;
        this.email = Email;
        this.address = Address;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String Identity) {
        this.identity = Identity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public TransactionCustomerS2P getAddress() {
        return address;
    }

    public void setAddress(TransactionCustomerS2P Address) {
        this.address = Address;
    }
}
