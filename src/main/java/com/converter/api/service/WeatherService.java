package com.converter.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.converter.api.model.Temperature;
import com.converter.api.model.Weather;

import reactor.core.publisher.Mono;

@Service
public class WeatherService {

	private String apiKey = "b1a9400989894857b98d7abc621287c3";

	@Autowired
	private WebClient webClient;

	public Weather obterWeatherCodigo(String cityName) {
		Mono<Weather> monoWeather = this.webClient.method(HttpMethod.GET)
				.uri("/data/2.5/weather?q={cityName}&appid={apiKey}", cityName, apiKey)
				.retrieve()
				.bodyToMono(Weather.class);
		Weather weather = monoWeather.block();
		return weather;
	}

}
