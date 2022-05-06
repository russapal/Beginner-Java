package utils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import practice.VolunteerDetails;

import custom_handling.CustomException;

import static practice.VolunteerDetails.sdf;

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
	public static VolunteerDetails validateInputs(int id, String name , String bdate , String hobby, 
			ArrayList<VolunteerDetails> vols) throws CustomException, ParseException {
		checkForDup(name, vols);
		// => no dup detected!
		Date Birthdate = parseNValidateDate(bdate);
		// => date is valid
		return new VolunteerDetails(id,name,Birthdate,hobby);
	}

	// add static method for chking dup chasis nos
	public static void checkForDup(String name, ArrayList<VolunteerDetails> vols) throws CustomException {
		// create vehicle instance to wrap PK : chasis no
		VolunteerDetails newVolunteer = new VolunteerDetails(name);
		// how to chk for dups ? Use AL API
		// public boolean contains(Object o)
		if (vols.contains(newVolunteer))
			throw new CustomException("Dup entry !!!!!!!!!!!");
	}


	// add static method to parse n validate the manu. date
	public static Date parseNValidateDate(String bdate) throws ParseException, CustomException {
		// parsing : string --> Date
		Date d1 = sdf.parse(bdate);
		// => parsing is successful !
		if ( d1.after(endDate)) // validation
			throw new CustomException("Underage !!!!!!!!!!!!!!");
		// => parsing n validation successful !
		return d1;
	}

	// add static method to find vehicle by it's chasis no
	public static VolunteerDetails findVolunteerByName(String name, ArrayList<VolunteerDetails> selected)
			throws CustomException {
		// 1. wrap chasis no in a vehicle instance
		VolunteerDetails newVolunteer = new VolunteerDetails(name);
		// 2 . find out index of 1st occurrence of the match
		// public int indexOf(Object o)
		int index = selected.indexOf(newVolunteer);
		if (index == -1)// => no vehicle by chasis no found :
			throw new CustomException("Invalid Name: Volunteer not found!!!!!!!!!!!!");
		//=> vehicle is found	
		// 3 . AL's get
		// public E get(int index)
		return selected.get(index);
	}

}
