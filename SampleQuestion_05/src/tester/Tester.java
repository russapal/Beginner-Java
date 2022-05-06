package tester;
import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import practice.Product;


import custom_handling.CustomException;
import custom_sorting.ExpiryDate_Sorting;

public class Tester 
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// create suitable D.S to hold vehicle info in a growable manner : AL
			ArrayList<Product> products = new ArrayList<>();// 1 AL object : holder of Vehicle type of refs , size=0,
															// init capa=10

			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Add Product 2. Display Product details 3.Display specific product details "
						+ " 6. Delete product Details  9.Sort product as per date 100. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter new vehicle details : id , name , Expiry date , price");
						Product product = validateInputs(sc.next(), sc.next(), sc.next(),sc.nextDouble(), products);
						// => no validation errs
						products.add(product);// appends validated vehicle ref to the AL
						System.out.println("product added to the list ....................");
						break;
					case 2:
						System.out.println("product details");
						for (Product v : products)
							System.out.println(v);// Vehicle's toString will be invoked
						break;
					case 3:
						System.out.println("Enter id no");
						product = findProductByid(sc.next(), products);
						// => vehicle is found
						System.out.println(product);
						// if vehicle by supplied chasis no exists --display it's details
						// o.w -- throw custom exc
						// Suggestion : add another method n simply invoke it from here.
						break;
				
					case 6:
						System.out.println("Enter Id , to delete employee details");
						Product v1 = new Product(sc.next());
						// 1 . indexOf
						int index = products.indexOf(v1);
						if (index == -1)
							throw new CustomException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
						System.out.println("Removed details of " + products.remove(index));
						break;
	
					case 9 :
						//sort vehicle details as per manu. date
					//	Collections.sort(vehicles);//chasis no based sorting
						//API of Collections class
						//public static void sort(List<T> list , Comparator<T> comp)
						//1st arg : list to be sorted
						//2nd arg : instance of the class that imple. Comparator
						Collections.sort(products, new ExpiryDate_Sorting());
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// System.out.println(e.getMessage());
				}
				// read off all pending i/ps from the scanner : till next line
				sc.nextLine();

			}
		} // JVM auto close sc.close()

	}


}
