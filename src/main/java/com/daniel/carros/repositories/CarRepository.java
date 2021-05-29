package com.daniel.carros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.carros.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	
	
}
