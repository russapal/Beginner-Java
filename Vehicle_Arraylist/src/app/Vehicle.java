package app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle implements Comparable<Vehicle>
{
	private String chasisNo;
	private Color vehicleColor;
	private double price;
	private Date manufactureDate;
	private int Id;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(String chasisNo, Color color, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = color;
		this.price = price + vehicleColor.getAdditionalCost();
		this.manufactureDate = manufactureDate;
	}


	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
			
		return "Vehicle chasisNo=" + chasisNo + ", color=" + vehicleColor + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) ;
	}


	@Override
	public boolean equals(Object anotherVehicle) {
		System.out.println("in vehicle's equals");
		if (anotherVehicle instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) anotherVehicle).chasisNo);
		return false;

	}

	@Override
	public int compareTo(Vehicle o) {
		System.out.println("in vehicle's compreTo");
		return chasisNo.compareTo(o.chasisNo);
	}
	
	public String getChasisNo() {
		return chasisNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}


	public Integer getId() {
		
		return Id;
	}	
	
}


