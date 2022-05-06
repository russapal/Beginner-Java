package com.app.org;


public class Emp 
{
	public int id;
	static int autoin;
	private String name;
	private String deptId;
	protected double basic;
	
	public Emp (String name,String deptId,double basic) 
	{
		System.out.println("at emp class");
		//super() --> Object class constructor
		this.name = name;
		id= ++autoin; // auto id generation
		this.deptId=deptId;
		this.basic = basic;
		}
	
	public void setbasic(double basic)
	{
		this.basic=basic;
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
