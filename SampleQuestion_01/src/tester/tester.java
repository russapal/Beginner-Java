package tester;
import studentData.StudentDetails;
import java.util.Scanner;
import customException.CustomException;
import static utils.ValidationRules.*;

public class tester
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Student capacity");
			// create suitable D.S to hold vehicle info
			StudentDetails[] students = new StudentDetails[sc.nextInt()];// 1 array object : holder of Vehcile type of refs
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Add Student 2. Display student details 3.Display specific student details based on course 4.Update student marks and phone no 10. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						// chk for space in showroom
						if (counter < students.length) {
							// capacity exists :
							System.out.println("Enter new student details : ");
							System.out.println("id , name  phoneNo email courseName  marks");
							StudentDetails student = validateInputs(sc.next(), sc.next(), sc.nextInt(), sc.next(),sc.next(), sc.nextDouble(), students);
							// => no validation errs
							students[counter++] = student;
							System.out.println("Student added to the System.....");
						} else
							throw new CustomException("Capacity full!!!!!!!!!!!!!!!");
						break;
					case 2:
						System.out.println("Student details");
						for (StudentDetails s : students)
							if (s != null)
								System.out.println(s);// Vehicle's toString will be invoked
						break;
					case 3:
						System.out.println("Enter course name");
						StudentDetails student = findStudentByCourseName(sc.next(), students);
						// => vehicle is found
						System.out.println(student);
						// if vehicle by supplied chasis no exists --display it's details
						// o.w -- throw custom exc
						// Suggestion : add another method n simply invoke it from here.
						break;
						
					case 4:
						System.out.println("------------------------------------------");
						System.out.println(" \t Update Marks and Phone No. \t");
						System.out.println("Enter ID ,  marks and phone no.");
						String id=sc.next();
						double marks=sc.nextDouble();
						int phoneno = sc.nextInt();
						
						
						boolean stufound = false;
						for (int i= 0; i<students.length;i++)
						{
							if(students[i] != null)
							{
								if (students[i].getid()==id)
								{
									stufound=true;
									students[i].setmarks(students[i].getmarks()+marks);
									students[i].setphoneno(students[i].getphoneNo()+phoneno);
									break;
									
								}
							}
							}
						if (stufound == false)
							System.out.println("Not found");
						break;
				
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// System.out.println(e.getMessage());
				}
				//read off all pending i/ps from the scanner : till next line
				sc.nextLine();

			}
		} // JVM auto close sc.close()

	}
}
	
		






