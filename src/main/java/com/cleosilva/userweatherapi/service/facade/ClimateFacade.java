package com.cleosilva.userweatherapi.service.facade;

import com.cleosilva.userweatherapi.client.OpenWeatherClient;
import com.cleosilva.userweatherapi.dto.ClimateDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ClimateFacade {
    private final OpenWeatherClient openWeatherClient;

    @Value("${openweathermap.api.key}")
    private String apiKey;

    public ClimateFacade(OpenWeatherClient openWeatherClient) {
        this.openWeatherClient = openWeatherClient;
    }

    public ClimateDTO getClimate(String city){
        Map<String, Object> response = openWeatherClient.getClimate(city, apiKey, "metric", "pt_br");

        Map<String, Object> main = (Map<String, Object>) response.get("main");
        List<Map<String, Object>> weatherList = (List<Map<String, Object>>) response.get("weather");

        Double temp = (Double) main.get("temp");
        String description = (String) weatherList.get(0).get("description");

        return new ClimateDTO(temp, description);
    }
}
