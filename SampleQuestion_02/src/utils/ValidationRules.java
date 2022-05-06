package utils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import practice.Emp;

import custom_handling.CustomException;

import static practice.Emp.sdf;

public class ValidationRules 
{
	private static Date endDate;
	static {
		try {
			endDate = sdf.parse("31-3-2001");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// add static method (which will be invoked by tester) to validate all i/ps
	public static Emp validateInputs(String id, String name , String bdate , String hdate , String dept, double salary,
			ArrayList<Emp> emps) throws CustomException, ParseException {
		checkForDup(id, emps);
		// => no dup detected!
		Date Birthdate = parseNValidateDate(bdate);
		Date Hiredate = parseNValidateDate(hdate);
		// => date is valid
		return new Emp(id,name,Birthdate,Hiredate,dept,salary);
	}

	public static void checkForDup(String id, ArrayList<Emp> emps) throws CustomException {
		
		Emp newEmployee = new Emp(id);

		if (emps.contains(newEmployee))
			throw new CustomException("Dup entry !!!!!!!!!!!");
	}


	
	public static Date parseNValidateDate(String hdate) throws ParseException, CustomException {
		// parsing : string --> Date
		Date d1 = sdf.parse(hdate);
		// => parsing is successful !
		if ( d1.after(endDate)) // validation
			throw new CustomException("Invalid Hiring date !!!!!!!!!!!!!!");
		// => parsing n validation successful !
		return d1;
	}


	public static Emp findEmployeeByid(String id, ArrayList<Emp> selected)
			throws CustomException {
		
		Emp newEmployee = new Emp(id);
		
		int index = selected.indexOf(newEmployee);
		if (index == -1)
			throw new CustomException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
	
		return selected.get(index);
	}

}
