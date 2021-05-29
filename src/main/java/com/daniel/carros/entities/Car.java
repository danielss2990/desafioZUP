package com.daniel.carros.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_car")
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String brand;

	private String model;

	private Integer year;

	private String weekDay;
	
	private Boolean rodizio;
	
	private String modelValue;

	public Car() {

	}

	public Car(Long id, String brand, String model, Integer year) {

		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
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

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public static String diaDaSemana(int x) {
		String dia;
		switch (x) {
		case 0:
			dia = "MONDAY";
			break;
		case 1:
			dia = "MONDAY";
			break;
		case 2:
			dia = "TUESDAY";
			break;
		case 3:
			dia = "TUESDAY";
			break;
		case 4:
			dia = "WEDNESDAY";
			break;
		case 5:
			dia = "WEDNESDAY";
			break;
		case 6:
			dia = "THURSDAY";
			break;
		case 7:
			dia = "THURSDAY";
			break;
		case 8:
			dia = "FRIDAY";
			break;
		case 9:
			dia = "FRIDAY";
			break;
		default:
			dia = "valor invalido";
			break;
		}

		return dia;

	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
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
