package com.converter.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.converter.api.model.Weather;
import com.converter.api.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/cidade/{cityName}")
	public ResponseEntity<Weather> obterGameId(@PathVariable String cityName){
		Weather weather = this.weatherService.obterWeatherCodigo(cityName);
		return ResponseEntity.ok(weather);
	}
	
	@GetMapping("/cidade")
	public ModelAndView mostrar() {
		return new ModelAndView("cidade");
	}
	
	
	
	
}
