package com.cleosilva.userweatherapi.dto;

public class ClimateDTO {
    private Double temperatura;
    private String description;

    public ClimateDTO(Double temperatura, String description) {
        this.temperatura = temperatura;
        this.description = description;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
