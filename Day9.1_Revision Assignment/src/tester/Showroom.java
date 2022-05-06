package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cdac.core.Vehicle;
import static com.cdac.core.Vehicle.sdf;

public class Showroom {

	public static void main(String[] args) {
		// 1. use SDF declared in Vehicle class : sdf
	
		// accept vehicle details from user , currently no validation rules , create
		// vehicle instance
		// display it's details : toString
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter vehicle details : chasisNo,  color,  price, manufactureDate(day-mon-yr)");
			Vehicle v1 = new Vehicle(sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			//=> vehicle instance created 
			System.out.println(v1);
		} // JVM : sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
