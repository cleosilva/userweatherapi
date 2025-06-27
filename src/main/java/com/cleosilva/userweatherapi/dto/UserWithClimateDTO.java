package com.cleosilva.userweatherapi.dto;

public class UserWithClimateDTO {
    private String name;
    private String email;
    private String city;
    private ClimateDTO climate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ClimateDTO getClimateDTO() {
        return climate;
    }

    public void setClimateDTO(ClimateDTO climate) {
        this.climate = climate;
    }


}
