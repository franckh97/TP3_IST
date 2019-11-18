package com.example.CarRental;
import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import com.fasterxml.jackson.annotation.JsonIgnore;

@EntityScan
public class Rent {
	
	Date date;
	long id;
	Car car;
	
	
	public Rent(Date date) {
		super();
		this.date = date;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
