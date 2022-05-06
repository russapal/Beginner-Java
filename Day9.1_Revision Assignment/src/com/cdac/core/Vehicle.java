package com.cdac.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * vehicle details : chasisNo(string) : unique, color(string) , price(double) , manufactureDate(Date)
 */
public class Vehicle {
	private String chasisNo;
	private String color;
	private double price;
	private Date manufactureDate;
	//SDF : 1 single copy to be shared across multiple Vehicles
	public static SimpleDateFormat sdf;//def value=null
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Vehicle(String chasisNo, String color, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+sdf.format(manufactureDate)+ "]";
	}	
}
