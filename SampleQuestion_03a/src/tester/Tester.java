package tester;
import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import practice.StudentDetails;


import custom_handling.CustomException;
import custom_sorting.RegistrationDate_Sorting;

public class Tester 
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// create suitable D.S to hold vehicle info in a growable manner : AL
			ArrayList<StudentDetails> students = new ArrayList<>();// 1 AL object : holder of Vehicle type of refs , size=0,
															// init capa=10

			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Add Student 2. Display Student details 3.Display specific student details "
						+ " 6. Delete Student Details  9.Sort students as per registration date 100. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter new student details : id , name , age , Registration date , course");
						StudentDetails student = validateInputs(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(),sc.next(), students);
						// => no validation errs
						students.add(student);// appends validated vehicle ref to the AL
						System.out.println("Student added to the list ....................");
						break;
					case 2:
						System.out.println("Student details");
						for (StudentDetails v : students)
							System.out.println(v);// Vehicle's toString will be invoked
						break;
					case 3:
						System.out.println("Enter name");
						student = findStudentByName(sc.next(), students);
						// => vehicle is found
						System.out.println(student);
						// if vehicle by supplied chasis no exists --display it's details
						// o.w -- throw custom exc
						// Suggestion : add another method n simply invoke it from here.
						break;
				
					case 6:
						System.out.println("Enter name , to delete student details");
						StudentDetails v1 = new StudentDetails(sc.next());
						// 1 . indexOf
						int index = students.indexOf(v1);
						if (index == -1)
							throw new CustomException("Invalid Name: student not found!!!!!!!!!!!!");
						System.out.println("Removed details of " + students.remove(index));
						break;
	
					case 9 :
						//sort vehicle details as per manu. date
					//	Collections.sort(vehicles);//chasis no based sorting
						//API of Collections class
						//public static void sort(List<T> list , Comparator<T> comp)
						//1st arg : list to be sorted
						//2nd arg : instance of the class that imple. Comparator
						Collections.sort(students, new RegistrationDate_Sorting());
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
