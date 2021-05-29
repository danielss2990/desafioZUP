package com.daniel.carros.services;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daniel.carros.entities.Car;
import com.daniel.carros.entities.dto.CarDTO;
import com.daniel.carros.repositories.CarRepository;
import com.daniel.carros.services.exceptions.DatabaseException;
import com.daniel.carros.services.exceptions.ResourceNotFoundException;

@Service
public class CarService {
	

	@Autowired
	private CarRepository carRepository;

	@Transactional(readOnly = true)
	public List<CarDTO> findAll() {

		List<Car> list = carRepository.findAll();

		List<CarDTO> listDto = new ArrayList<>();

		for (Car car : list) {
			setWeekDay(car);
			listDto.add(new CarDTO(car));
		}

		return listDto;

	}

	@Transactional(readOnly = true)
	public CarDTO findById(Long id) {

		Optional<Car> obj = carRepository.findById(id);
		Car entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		setWeekDay(entity);
		return new CarDTO(entity);
	}

	@Transactional
	public CarDTO insert(CarDTO dto) {

		Car entity = new Car();
		copyDtoToEntity(dto, entity);
		entity = carRepository.save(entity);

		return new CarDTO(entity);
	}

	@Transactional
	public CarDTO update(Long id, CarDTO dto) {
		try {
			Car entity = carRepository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = carRepository.save(entity);
			return new CarDTO(entity);
		} catch (javax.persistence.EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
	}

	public void delete(Long id) {
		try {
			carRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("id not found" + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	private void copyDtoToEntity(CarDTO dto, Car entity) {
		entity.setBrand(dto.getBrand());
		entity.setModel(dto.getModel());
		entity.setYear(dto.getYear());
		setWeekDay(entity);
	}
	
	public static String modelVal(String nome) {
		
		Map<String, String> mapaMarcas = new HashMap<>();
	    mapaMarcas.put("ACURA",  "1");
	    mapaMarcas.put("AGRALE", "2");
	    mapaMarcas.put("ALFA ROMEO", "3");
	    mapaMarcas.put("AM GEN", "4");
	    mapaMarcas.put("ASIA MOTORS", "5");
	    mapaMarcas.put("ASTON MARTIN", "189");
	    mapaMarcas.put("AUDI", "6");
	    mapaMarcas.put("BABY", "207");
	    mapaMarcas.put("BMW", "7");
	    mapaMarcas.put("BRM", "8");
	    mapaMarcas.put("BUGRE", "123");
	    mapaMarcas.put("CADILLAC", "10");
	    mapaMarcas.put("CBT JIPE", "11");
	    mapaMarcas.put("CHANA", "136");
	    mapaMarcas.put("CHANGAN", "182");
	    mapaMarcas.put("CHERY", "161");
	    mapaMarcas.put("CHRYSLER", "12");
	    mapaMarcas.put("CITROEN", "13");
	    mapaMarcas.put("CROSS LANDER", "14");
	    mapaMarcas.put("DAEWOO", "15");
	    mapaMarcas.put("DAIHATSU", "16");
	    mapaMarcas.put("DODGE", "17");
	    mapaMarcas.put("EFFA", "147");
	    mapaMarcas.put("ENGESA", "18");
	    mapaMarcas.put("ENVEMO", "19");
	    mapaMarcas.put("FERRARI", "20");
	    mapaMarcas.put("FIAT", "21");
	    mapaMarcas.put("FIBRAVAN", "149");
	    mapaMarcas.put("FORD", "22");
	    mapaMarcas.put("FOTON", "190");
	    mapaMarcas.put("FYBER", "170");
	    mapaMarcas.put("GEELY", "199");
	    mapaMarcas.put("GM", "23");
	    mapaMarcas.put("GREAT WALL", "153");
	    mapaMarcas.put("GURGEL", "24");
	    mapaMarcas.put("HAFEI", "152");
	    mapaMarcas.put("HONDA", "25");
	    mapaMarcas.put("HYUNDAI", "26");
	    mapaMarcas.put("ISUZU", "27");
	    mapaMarcas.put("IVECO", "208");
	    mapaMarcas.put("JAC", "177");
	    mapaMarcas.put("JAGUAR", "28");
	    mapaMarcas.put("JEEP", "29");
	    mapaMarcas.put("JINBEI", "154");
	    mapaMarcas.put("JPX", "30");
	    mapaMarcas.put("KIA MOTORS", "31");
	    mapaMarcas.put("LADA", "32");
	    mapaMarcas.put("LAMBORGHINI", "171");
	    mapaMarcas.put("LAND ROVER", "33");
	    mapaMarcas.put("LEXUS", "34");
	    mapaMarcas.put("LIFAN", "168");
	    mapaMarcas.put("LOBINI", "127");
	    mapaMarcas.put("LOTUS", "35");
	    mapaMarcas.put("MAHINDRA", "140");
	    mapaMarcas.put("MASERATI", "36");
	    mapaMarcas.put("MATRA", "37");
	    mapaMarcas.put("MAZDA", "38");
	    mapaMarcas.put("MERCEDES-BENZ", "39");
	    mapaMarcas.put("MERCURY", "40");
	    mapaMarcas.put("MG", "167");
	    mapaMarcas.put("MINI", "156");
	    mapaMarcas.put("MITSUBISHI", "41");
	    mapaMarcas.put("MIURA", "42");
	    mapaMarcas.put("NISSAN", "43");
	    mapaMarcas.put("PEUGEOT", "44");
	    mapaMarcas.put("PLYMOUTH", "45");
	    mapaMarcas.put("PONTIAC", "46");
	    mapaMarcas.put("PORSCHE", "47");
	    mapaMarcas.put("RAM", "185");
	    mapaMarcas.put("RELY", "186");
	    mapaMarcas.put("RENAULT", "48");
	    mapaMarcas.put("ROLLS-ROYCE", "195");
	    mapaMarcas.put("ROVER", "49");
	    mapaMarcas.put("SAAB", "50");
	    mapaMarcas.put("SATURN", "51");
	    mapaMarcas.put("SEAT", "52");
	    mapaMarcas.put("SHINERAY", "183");
	    mapaMarcas.put("SMART", "157");
	    mapaMarcas.put("SSANGYONG", "125");
	    mapaMarcas.put("SUBARU", "54");
	    mapaMarcas.put("SUZUKI", "55");
	    mapaMarcas.put("TAC", "165");
	    mapaMarcas.put("TOYOTA", "56");
	    mapaMarcas.put("TROLLER", "57");
	    mapaMarcas.put("VOLVO", "58");
	    mapaMarcas.put("VW", "59");
	    mapaMarcas.put("WAKE", "163");
	    mapaMarcas.put("WALK", "120");
	    
	    
		
	    return mapaMarcas.get(nome.toUpperCase());
	    
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

	private void setWeekDay(Car car) {

		String data = Integer.toString(car.getYear());
		int numero = Character.getNumericValue(data.charAt(3));
		String dia = diaDaSemana(numero);

		car.setWeekDay(dia);
		
		
		
		DayOfWeek d = Instant.now().atZone(ZoneId.systemDefault()).getDayOfWeek();
		
		if(car.getWeekDay().equals(d.toString())){
			car.setRodizio(true);
			car.setModelValue(modelVal(car.getBrand()));
		}else {
			car.setRodizio(false);
			car.setModelValue(modelVal(car.getBrand()));
		}
	}
	
}
