package com.safe2pay.dto.general.address;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryS2P {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;

    public CountryS2P() {
    }

    @Builder
    public CountryS2P(int Id, String Name) {
        this.id = Id;
        this.name = Name;
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
}
