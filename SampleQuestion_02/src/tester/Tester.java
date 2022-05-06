package tester;
import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import practice.Emp;


import custom_handling.CustomException;
import custom_sorting.HiringDate_Sorting;

public class Tester 
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			ArrayList<Emp> employees = new ArrayList<>();

			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Add Employee 2. Display Employee details 3.Display specific employee details "
						+ " 6. Delete Employee Details  9.Sort vehicles as per date 100. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter new vehicle details : id , name , dob , Hiring date , dept , Salary");
						Emp employee = validateInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.next(),sc.nextDouble(), employees);
						employees.add(employee);
						System.out.println("Employee added to the list ....................");
						break;
					case 2:
						System.out.println("Employee details");
						for (Emp v : employees)
							System.out.println(v);
						break;
					case 3:
						System.out.println("Enter id no");
						employee = findEmployeeByid(sc.next(), employees);
						System.out.println(employee);
						break;
				
					case 6:
						System.out.println("Enter Id , to delete employee details");
						Emp v1 = new Emp(sc.next());
						int index = employees.indexOf(v1);
						if (index == -1)
							throw new CustomException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
						System.out.println("Removed details of " + employees.remove(index));
						break;
	
					case 9 :
						Collections.sort(employees, new HiringDate_Sorting());
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
		} // JVM auto close sc.close()

	}


}
