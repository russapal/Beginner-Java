package com.app.util;
import com.app.exception.CustomException;

public class EmpUtil 
{
	public static int min_inc;
	public static int max_inc;
	
	static {
		min_inc = 100;
		max_inc = 8000;
	}
	//add static method to validate speed of a vehicle
	public static void validateSalary(int inc) throws CustomException
	{
		if(inc <= min_inc)
			throw new CustomException("Very little increment!!!!!!!!!!!!");
		//=> speed > MIN speed
		if(inc >= max_inc)
			throw new CustomException("Too high increment please check again !!!!!!!!!!");
		System.out.println("Exiting from increment option ");
	}
	

}
