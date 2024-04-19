package com.safe2pay.dto.general.address;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityS2P {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("IdState")
    private int idState;
    @JsonProperty("CodeIBGE")
    private String codeIBGE;
    @JsonProperty("Name")
    private String name;

    @Builder
    public CityS2P(int id, int idState, String codeIBGE, String name) {
        this.id = id;
        this.idState = idState;
        this.codeIBGE = codeIBGE;
        this.name = name;
    }

    public CityS2P() {
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getIdState() {
        return idState;
    }

    public void setIdState(int IdState) {
        this.idState = IdState;
    }

    public String getCodeIBGE() {
        return codeIBGE;
    }

    public void setCodeIBGE(String CodeIBGE) {
        this.codeIBGE = CodeIBGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
}
