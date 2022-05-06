package com.app.org;

public class Worker extends Emp 
{
	
	
	private double hoursWorked,hourlyRate;
	
	public Worker(String n,String d,double b,double hw ,double hr)
	{
		super (n,d,b);
		System.out.println("At worker class");
		hoursWorked = hw;
		hourlyRate = hr;
	}
	
	public String toString()
	{
		return  "Details \n "+super.toString()+ " \n Working hours \t" +hoursWorked;
	}
	
	public double gethourworked()
	{
		return hoursWorked;
	}
	
	public double gethourlyrate()
	{
		return hourlyRate;
	}
	
	@Override
	public double compute_netsalary()
	{
		double netsalary = super.basic + (hoursWorked*hourlyRate);
		return netsalary;
	}
}
