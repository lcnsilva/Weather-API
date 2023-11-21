package com.converter.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WeatherApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApi1Application.class, args);
	}
	
	@Bean
	public WebClient webClient(WebClient.Builder Builder) {
		return Builder
				.baseUrl("https://api.openweathermap.org")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}

}
