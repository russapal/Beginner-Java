package tester;
import static utils.ValidatationRules.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import app.Vehicle;

import custom_handling.CustomException;
import custom_sorting.DateComparator;
import custom_sorting.PriceComparator;

public class Tester {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			ArrayList<Vehicle> vehicles = new ArrayList<>();

			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Add Vehicle 2. Display showroom details 3.Display specific vehicle details "
								+ "4. Update Price 5. Delete vehicle Details 6. Apply Discount "
								+ "7. Sort vehicles as per chasis no 8.Sort vehicles as per date "
								+ "9 .Sort vehicles as per price 100. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter new vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
						Vehicle vehicle = validateVehicleInputs(sc.next(), sc.next().toUpperCase(), sc.nextDouble(),
								sc.next(), vehicles);
				
						vehicles.add(vehicle);
						System.out.println("Vehicle added to the showroom.....");
						break;
					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : vehicles)
							System.out.println(v);
						break;
					case 3:
						System.out.println("Enter chasis no");
						vehicle = findVehicleByChasisNo(sc.next(), vehicles);
					
						System.out.println(vehicle);
						break;
					
					case 4:
						System.out.println("Enter chasis no n price offset");
						vehicle = findVehicleByChasisNo(sc.next(), vehicles);
						
						vehicle.setPrice(vehicle.getPrice() + sc.nextDouble());
						System.out.println("Price updated....");
						break;
					
					case 5:
						System.out.println("Enter chasis no , to delete vehicle details");
						Vehicle v1 = new Vehicle(sc.next());
						
						int index = vehicles.indexOf(v1);
						if (index == -1)
							throw new CustomException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
						System.out.println("Removed details of " + vehicles.remove(index));
						break;
					case 6:
						
						System.out.println("Enter date (day-mon-yr) discount");
						Date date = parseNValidateDate(sc.next());
						double discount = sc.nextDouble();
						
						for (Vehicle v : vehicles)
							if (v.getManufactureDate().before(date))
								v.setPrice(v.getPrice() - discount);
						break;
					
					case 7:
						
						Collections.sort(vehicles);
						break;
					
					case 8 :
	
						Collections.sort(vehicles, new DateComparator());
						break;
	
					
					case 9 :
						System.out.println("Sorting vehicle details as per the price");
						Collections.sort(vehicles,new PriceComparator());
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				
				}
				
				sc.nextLine();

			}
		} 

	}

}


