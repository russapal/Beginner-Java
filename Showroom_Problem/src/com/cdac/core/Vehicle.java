package com.cdac.core;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Vehicle 
{
		private String chasisNo;
		private Colour vehicleColor;//HAS-A
		private double price;
		private Date manufactureDate;
		//SDF : 1 single copy to be shared across multiple Vehicles
		public static SimpleDateFormat sdf;//def value=null
		static {
			sdf = new SimpleDateFormat("dd-MM-yyyy");
		}
		
		public Vehicle(String chasisNo, Colour color, double price, Date manufactureDate) {
			super();
			this.chasisNo = chasisNo;
			this.vehicleColor = color;
			this.price = price;
			this.manufactureDate = manufactureDate;
		}
		@Override
		public String toString() {
			return "Vehicle [chasisNo=" + chasisNo + ", color=" + vehicleColor + ", price=" + price + ", manufactureDate="
					+sdf.format(manufactureDate)+ "]";
		}	

}
