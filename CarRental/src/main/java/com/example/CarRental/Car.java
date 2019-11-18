package com.example.CarRental;

public class Car {
	
	private String plateNumber;
	private String brand;
	private int price;
	private int numberofseats;
	
	public Car() {
		super();
	}
	
	public Car(String plateNumber, String brand, int price, int numberofseats) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.price = price;
		this.numberofseats = numberofseats;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int numberofseats() {
		return numberofseats;
	}
	
	public int getnumberofseats() {
		return numberofseats;
	}
	
	public void setnumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	
	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", price=" + price +", numberofseats="+ numberofseats+ " ]";
	}

}