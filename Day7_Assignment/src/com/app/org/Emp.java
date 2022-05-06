package com.app.org;

public class Emp 
{
	public int id;
	static int autoin; //gets memory only once i.e; when class is loaded. Located in method area which makes it memory efficient
	//static can refer to common property of of object.
	private String name;
	private String deptId;
	protected double basic;
	
	//Encapsulation: Wrapping of data under a single unit. binds code and the data it manipulates.
	//achieved by declaring all data members as private and methods in the class public by using get and set value mechanism
	//Advantages: Data Hiding, Increased flexibility , Reusability,Testing code is easy
	
	public Emp (String name,String deptId,double basic) 
	{
		System.out.println("at emp class");
		//super() --> Object class constructor
		this.name = name;
		id= ++autoin; // auto id generation
		this.deptId=deptId;
		this.basic = basic;
		}
	
	public Emp(int i, String n, String d, double b) {
		// TODO Auto-generated constructor stub
	}

	public void setbasic(double basic)
	{
		this.basic=basic;/*this keyword eliminate confusion between class attributes and parameter with the same name
		Invoke current class constructor(like above)
		Invoke current class method (like rightnow)
		Pass an argument in method and constructor call
		Return the current class object */
	}
	
	@Override
	public String toString()
	{
		System.out.println("------------------------------------------");
		return "ID =  "+id +" \n  Employee = \t" + name + "\n Department = \t" +deptId+ "\n Basic salary \t " +basic;	
				}
	
	public double compute_netsalary()
	{
		double netsalary = 0;
		return netsalary;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getdept()
	{
		return deptId;
	}
	
	public double getbasicsalary()
	{
		return basic;
	}

}
