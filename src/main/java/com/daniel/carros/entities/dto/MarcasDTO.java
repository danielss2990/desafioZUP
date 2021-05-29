package com.daniel.carros.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class MarcasDTO {

	private List<ItemDTO> marcas = new ArrayList<>();
	
	
	public MarcasDTO() {
	}

	public List<ItemDTO> getModelos() {
		return marcas;
	}

	public void setModelos(List<ItemDTO> marcas) {
		this.marcas = marcas;
	}

}