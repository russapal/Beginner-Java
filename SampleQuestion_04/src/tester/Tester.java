package tester;
import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import practice.VolunteerDetails;


import custom_handling.CustomException;
import custom_sorting.RegistrationDate_Sorting;

public class Tester 
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// create suitable D.S to hold vehicle info in a growable manner : AL
			ArrayList<VolunteerDetails> volunteers = new ArrayList<>();// 1 AL object : holder of Vehicle type of refs , size=0,
															// init capa=10

			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Add Volunteer 2. Display Volunteer details 3.Display specific volunteer details "
						+ " 6. Delete Volunteer Details  9.Sort students as per birth date 100. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter new student details : id , name , age , Registration date , course");
						VolunteerDetails volunteer = validateInputs(sc.nextInt(), sc.next(), sc.next(),sc.next(), volunteers);
						// => no validation errs
						volunteers.add(volunteer);// appends validated vehicle ref to the AL
						System.out.println("Volunteer added to the list ....................");
						break;
					case 2:
						System.out.println("Volunteer details");
						for (VolunteerDetails v : volunteers)
							System.out.println(v);// Vehicle's toString will be invoked
						break;
					case 3:
						System.out.println("Enter name");
						volunteer = findVolunteerByName(sc.next(), volunteers);
						// => vehicle is found
						System.out.println(volunteer);
						// if vehicle by supplied chasis no exists --display it's details
						// o.w -- throw custom exc
						// Suggestion : add another method n simply invoke it from here.
						break;
				
					case 6:
						System.out.println("Enter name , to delete student details");
						VolunteerDetails v1 = new VolunteerDetails(sc.next());
						// 1 . indexOf
						int index = volunteers.indexOf(v1);
						if (index == -1)
							throw new CustomException("Invalid Name: student not found!!!!!!!!!!!!");
						System.out.println("Removed details of " + volunteers.remove(index));
						break;
	
					case 9 :
						//sort vehicle details as per manu. date
					//	Collections.sort(vehicles);//chasis no based sorting
						//API of Collections class
						//public static void sort(List<T> list , Comparator<T> comp)
						//1st arg : list to be sorted
						//2nd arg : instance of the class that imple. Comparator
						Collections.sort(volunteers, new RegistrationDate_Sorting());
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
