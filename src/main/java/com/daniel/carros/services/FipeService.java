package com.daniel.carros.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.daniel.carros.entities.dto.EspecDTO;
import com.daniel.carros.entities.dto.ModelosDTO;

@Service
public class FipeService {

	@Autowired
	private RestTemplate restTemplate;

	

	public ModelosDTO getModelosV1(Long marcaId) {

		String path = "https://parallelum.com.br/fipe/api/v1/carros/marcas/{marcaId}/modelos";

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("marcaId", marcaId.toString());

		ResponseEntity<ModelosDTO> result = restTemplate.getForEntity(path, ModelosDTO.class, uriVariables);
		return result.getBody();
	}

	public ModelosDTO getModelosV2(Long marcaId) {

		String path = "https://parallelum.com.br/fipe/api/v1/carros/marcas/{marcaId}/modelos";

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("marcaId", marcaId.toString());

		ParameterizedTypeReference<ModelosDTO> responseType = new ParameterizedTypeReference<ModelosDTO>() {
		};
		ResponseEntity<ModelosDTO> result = restTemplate.exchange(path, HttpMethod.GET, null, responseType,
				uriVariables);
		return result.getBody();
	}
	
	
		
		
		public EspecDTO getPreco(Long marcaId, Long modeloId, String anoId) {

		String path = "https://parallelum.com.br/fipe/api/v1/carros/marcas/{marcaId}/modelos/{modeloId}/anos/{anoId}";
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("marcaId", marcaId.toString());
		uriVariables.put("modeloId", marcaId.toString());
		uriVariables.put("anoId", anoId.toString());
		
		ResponseEntity<EspecDTO> result = restTemplate.getForEntity(path, EspecDTO.class,uriVariables);
		return result.getBody();
	}

}
