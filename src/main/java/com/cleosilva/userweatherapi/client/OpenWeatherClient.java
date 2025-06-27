package com.cleosilva.userweatherapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@FeignClient(name="openweather", url="https://api.openweathermap.org/data/2.5")
public interface OpenWeatherClient {
    @GetMapping("/weather")
    Map<String, Object> getClimate(@RequestParam("q") String city,
                                 @RequestParam("appid") String apiKey,
                                 @RequestParam("units") String units,
                                 @RequestParam("lang") String lang);
}
