package com.cleosilva.userweatherapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@FeignClient(name="openweather", url="https://api.openweathermap.org/data/2.5")
public interface OpenWeatherClient {
    Map<String, Object> getClima(@RequestParam("q") String cidade,
                                 @RequestParam("appid") String apiKey,
                                 @RequestParam("units") String units,
                                 @RequestParam("lang") String lang);
}
