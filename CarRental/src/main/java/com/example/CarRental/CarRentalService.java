package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() {
		cars.add(new Car("11AA22", "Ferrari", 1000,2));
		cars.add(new Car("33BB44", "Porshe", 2222,2));
		cars.add(new Car("11AA22", "Audi", 1000,5));
		cars.add(new Car("33BB44", "Peugeot 206", 500,7));
		cars.add(new Car("11AA22", "Citroen C3", 600,5));
		cars.add(new Car("33BB44", "Renault twingo", 300,2));
		cars.add(new Car("11AA22", "Rolls Royce", 5000,5));
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Car> listOfCars(){
		return cars;
	}
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK) 
	@ResponseBody
	public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
		return null;
		
	}
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.DELETE) 
	@ResponseStatus(HttpStatus.OK) 
	public void getBack(@PathVariable("plateNumber") String plateNumber) throws Exception{
		
	}
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT) 
	@ResponseStatus(HttpStatus.OK) 
	public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{ 
		
	}
}
