package com.safe2pay.dto.general.address;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressS2P {

    @JsonProperty("ZipCode")
    private String zipCode;
    @JsonProperty("Street")
    private String street;
    @JsonProperty("Number")
    private String number;
    @JsonProperty("District")
    private String district;
    @JsonProperty("CityName")
    private String cityName;
    @JsonProperty("StateInitials")
    private String stateInitials;
    @JsonProperty("Complement")
    private String complement;
    @JsonProperty("CountryName")
    private String countryName;
    @JsonProperty("CodeIBGE")
    private String codeIBGE;
    @JsonProperty("City")
    private CityS2P city;
    @JsonProperty("State")
    private StateS2P state;
    @JsonProperty("Country")
    private CountryS2P country;


    public AddressS2P() {
    }

    @Builder
    public AddressS2P(String ZipCode, String Street, String Number, String District, String CityName, String StateInitials, String Complement, String CountryName) {
        this.zipCode = ZipCode;
        this.street = Street;
        this.number = Number;
        this.district = District;
        this.cityName = CityName;
        this.stateInitials = StateInitials;
        this.complement = Complement;
        this.countryName = CountryName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String ZipCode) {
        this.zipCode = ZipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String Complement) {
        this.complement = Complement;
    }

    public void setStreet(String Street) {
        this.street = Street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String Number) {
        this.number = Number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String District) {
        this.district = District;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String CityName) {
        this.cityName = CityName;
    }

    public String getStateInitials() {
        return stateInitials;
    }

    public void setStateInitials(String StateInitials) {
        this.stateInitials = StateInitials;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String CountryName) {
        this.countryName = CountryName;
    }

    public CityS2P getCity() {
        return city;
    }

    public void setCity(CityS2P City) {
        this.city = City;
    }

    public StateS2P getState() {
        return state;
    }

    public void setState(StateS2P State) {
        this.state = State;
    }

    public CountryS2P getCountry() {
        return country;
    }

    public void setCountry(CountryS2P Country) {
        this.country = Country;
    }

    public String getCodeIBGE() {
        return codeIBGE;
    }

    public void setCodeIBGE(String CodeIBGE) {
        this.codeIBGE = CodeIBGE;
    }

}
