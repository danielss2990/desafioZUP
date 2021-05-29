package com.daniel.carros.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.daniel.carros.entities.dto.CarDTO;
import com.daniel.carros.services.CarService;

@RestController
@RequestMapping(value = "/cars")
public class CarResource {
	
	@Autowired
	private CarService carService;
	
	@GetMapping
	public ResponseEntity<List<CarDTO>> findAll(){
		
		List<CarDTO> list = carService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CarDTO> findById(@PathVariable Long id){
		CarDTO dto = carService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<CarDTO> insert( @Valid @RequestBody CarDTO dto){
		CarDTO newDto = carService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDto.getId()).toUri();
		return ResponseEntity.created(uri).body(newDto);
		
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<CarDTO> update( @PathVariable Long id , @Valid @RequestBody CarDTO dto){
		CarDTO newDto = carService.update(id,dto);
		return ResponseEntity.ok().body(newDto);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<CarDTO> delete(@PathVariable Long id){
		carService.delete(id);
		return ResponseEntity.noContent().build();
		
	}

}
