package com.daniel.carros.entities.dto;

import java.io.Serializable;

import com.daniel.carros.entities.Car;

public class CarDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String brand;
	private String model;
	private Integer year;
	private String weekDay;
	private Boolean rodizio;
	private String modelValue;
	
	public CarDTO() {
		
	}

	public CarDTO(Long id, String brand, String model, Integer year) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public CarDTO(Car entity) {
		super();
		this.id = entity.getId();
		this.brand = entity.getBrand();
		this.model = entity.getModel();
		this.year = entity.getYear();
		this.weekDay = entity.getWeekDay();
		this.rodizio = entity.getRodizio();
		this.modelValue = entity.getModelValue();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	
	public String getWeekDay() {
		return weekDay;
	}
	
	public Boolean getRodizio() {
		return rodizio;
	}

	public void setRodizio(Boolean rodizio) {
		this.rodizio = rodizio;
	}

	public String getModelValue() {
		return modelValue;
	}

	public void setModelValue(String modelValue) {
		this.modelValue = modelValue;
	}

}
