package tester;
import static com.app.customer.Customer.sdf;

import java.util.Arrays;
import java.util.Scanner;

import com.app.customer.PaymentOption;
import com.app.customer.Customer;
import static com.app.customer.PaymentOption.*;

public class tester {
	
	public static void main(String[] args) {
		// 1. use SDF declared in Vehicle class : sdf
	
		// accept vehicle details from user , currently no validation rules , create
		// vehicle instance
		// display it's details : toString
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter customer details : name,  email , password, payment option, registration ammount,Dob(day-mon-yr)");
			System.out.println("Valid Payment Option "+Arrays.toString(values()));
			Customer v1 = new Customer(sc.next(),sc.next(),sc.next() ,valueOf(sc.next().toUpperCase()) , sc.nextDouble(), sdf.parse(sc.next()));
			//=> vehicle instance created 
			System.out.println(v1);
		} // JVM : sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
