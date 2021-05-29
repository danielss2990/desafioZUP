package com.daniel.carros.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.carros.entities.dto.EspecDTO;
import com.daniel.carros.entities.dto.ModelosDTO;
import com.daniel.carros.services.FipeService;

@RestController
@RequestMapping(value = "/marcas")
public class FipeResource {

	@Autowired
	private FipeService service;

	@GetMapping(value = "/{marcaId}/modelos")
	public ResponseEntity<ModelosDTO> getModelos(@PathVariable Long marcaId) {
		ModelosDTO list = service.getModelosV1(marcaId);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{marcaId}/modelos/{modeloId}/anos/{anoId}")
	public ResponseEntity<EspecDTO> getPreco(@PathVariable Long marcaId, @PathVariable Long modeloId, @PathVariable String anoId) {
		EspecDTO list = service.getPreco(marcaId, modeloId, anoId);
		return ResponseEntity.ok().body(list);
	}
	
}
