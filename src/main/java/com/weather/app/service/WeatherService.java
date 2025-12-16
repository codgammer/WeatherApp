package com.weather.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.app.model.WeatherResponse;

@Service
public class WeatherService {

    private final String apiKey;

    public WeatherService(
            @Value("${weather.api.key}") String apiKey
    ) {
        this.apiKey = apiKey;
    }

    public WeatherResponse getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.weatherapi.com/v1/current.json"
                + "?key=" + apiKey
                + "&q=" + city
                + "&aqi=no";

        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
