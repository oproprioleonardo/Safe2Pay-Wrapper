package com.safe2pay.dto.general.address;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StateS2P {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("IdCountry")
    private int idCountry;
    @JsonProperty("Initials")
    private String initials;
    @JsonProperty("Name")
    private Object name;

    @Builder
    public StateS2P(int id, int idCountry, String initials, Object name) {
        this.id = id;
        this.idCountry = idCountry;
        this.initials = initials;
        this.name = name;
    }

    public StateS2P() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }
}
