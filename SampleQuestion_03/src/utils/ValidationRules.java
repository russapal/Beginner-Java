package utils;

import static app.StudentDetails.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import app.StudentDetails;
import CustomException.CustomException;

public class ValidationRules {

	private static Date endDate;
	static {
		try {
			endDate = sdf.parse("31-3-2001");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// add static method (which will be invoked by tester) to validate all i/ps
	public static StudentDetails validateInputs(int id, String name , int age , String rdate , String course, 
			ArrayList<StudentDetails> stus) throws CustomException, ParseException {
		checkForDup(name, stus);
		// => no dup detected!
		Date Regdate = parseNValidateDate(rdate);
		// => date is valid
		return new StudentDetails(id,name , age , Regdate,course);
	}

	// add static method for chking dup chasis nos
	public static void checkForDup(String name, ArrayList<StudentDetails> stus) throws CustomException {
		// create vehicle instance to wrap PK : chasis no
		StudentDetails newStudent = new StudentDetails(name);
		// how to chk for dups ? Use AL API
		// public boolean contains(Object o)
		if (stus.contains(newStudent))
			throw new CustomException("Dup entry !!!!!!!!!!!");
	}


	// add static method to parse n validate the manu. date
	public static Date parseNValidateDate(String rdate) throws ParseException, CustomException {
		// parsing : string --> Date
		Date d1 = sdf.parse(rdate);
		// => parsing is successful !
		if ( d1.after(endDate)) // validation
			throw new CustomException("Invalid Hiring date !!!!!!!!!!!!!!");
		// => parsing n validation successful !
		return d1;
	}

	// add static method to find vehicle by it's chasis no
	public static StudentDetails findStudentByName(String name, ArrayList<StudentDetails> selected)
			throws CustomException {
		// 1. wrap chasis no in a vehicle instance
		StudentDetails newStudent = new StudentDetails(name);
		// 2 . find out index of 1st occurrence of the match
		// public int indexOf(Object o)
		int index = selected.indexOf(newStudent);
		if (index == -1)// => no vehicle by chasis no found :
			throw new CustomException("Invalid Name: Student not found!!!!!!!!!!!!");
		//=> vehicle is found	
		// 3 . AL's get
		// public E get(int index)
		return selected.get(index);
	}

}
