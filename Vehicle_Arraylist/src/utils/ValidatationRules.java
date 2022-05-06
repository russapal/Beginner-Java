package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import app.Color;
import app.Vehicle;

import custom_handling.CustomException;

import static app.Vehicle.sdf;

public class ValidatationRules {
	
	private static Date beginDate, endDate;
	static {
		try {
			beginDate = sdf.parse("1-4-2021");
			endDate = sdf.parse("31-3-2022");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}
	
	public static Vehicle validateVehicleInputs(String chasisNo, String color, double price, String date,
			ArrayList<Vehicle> vehicles) throws CustomException, ParseException {
		checkForDup(chasisNo, vehicles);
	
		Color vehicleClr = validateColor(color);
		Date manuDate = parseNValidateDate(date);

		return new Vehicle(chasisNo, vehicleClr, price, manuDate);
	}

	
	public static void checkForDup(String chasisNo, ArrayList<Vehicle> vehicles) throws CustomException {
	
		Vehicle newVehicle = new Vehicle(chasisNo);
		
		if (vehicles.contains(newVehicle))
			throw new CustomException("Dup chasis no !!!!!!!!!!!");
		System.out.println("no dup chasis no !!!!!!!!!!");
	}

	
	public static Color validateColor(String color) {
		return Color.valueOf(color);
	}

	
	public static Date parseNValidateDate(String date) throws ParseException, CustomException {

		Date d1 = sdf.parse(date);
		
		if (d1.before(beginDate) || d1.after(endDate)) 
			throw new CustomException("Invalid Manufacturing date !!!!!!!!!!!!!!");
		
		return d1;
	}

	
	public static Vehicle findVehicleByChasisNo(String chasisNo, ArrayList<Vehicle> showroom)
			throws CustomException {
	
		Vehicle newVehicle = new Vehicle(chasisNo);
		
		int index = showroom.indexOf(newVehicle);
		if (index == -1)
			throw new CustomException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
		
		return showroom.get(index);
	}

}
