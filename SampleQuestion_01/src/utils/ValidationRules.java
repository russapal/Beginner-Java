package utils;
import java.text.ParseException;
import studentData.StudentDetails;
import customException.CustomException;

public class ValidationRules 
{
	public static StudentDetails validateInputs(String id,String name , int phoneNo , String email ,String courseName ,
			double marks, StudentDetails[] students) throws CustomException,ParseException{
		checkForDup(email, students);
	
		
		return new StudentDetails(id, name, phoneNo, email, courseName , marks);		
	}


	public static void checkForDup(String email, StudentDetails[] students) throws CustomException{
		
		StudentDetails newStudent=new StudentDetails(email);
		for(StudentDetails s : students)
			if(s != null)
				if (s.equals(newStudent)) 
					throw new CustomException("Dup Email ID !!!!!!!!!!!");			
	}

	
	public static StudentDetails findStudentByCourseName(String courseName,StudentDetails[] sameCourse) throws CustomException
	{
		StudentDetails newStudent=new StudentDetails(courseName);
		for(StudentDetails c : sameCourse)
			if(c != null)
				if(c.equals(newStudent))
					return c;
		throw new CustomException("Invalid Course Name : Student not found!!!!!!!!!!!!");
	}
}


