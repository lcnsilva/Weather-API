package com.converter.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

	@JsonIgnoreProperties(ignoreUnknown = true)
	public Weather() {
	}

	private String name;
	private String timezone;
	private Long id;
	private Long cod;
	private Temperature main;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public Temperature getMain() {
		return main;
	}

	public void setMain(Temperature main) {
		this.main = main;
	}

	public Weather(String name, String timezone, Long id, Long cod, Temperature main) {
		super();
		this.name = name;
		this.timezone = timezone;
		this.id = id;
		this.cod = cod;
		this.main = main;
	}

}
