package com.app.org;

public class Mrg extends Emp
{

	private double performance_bonus;
	
	public Mrg(String n,String d,double b,double pb)
	{
		super (n,d,b);
		System.out.println("At mrg class");
		performance_bonus = pb;
	}
	
	public String toString()
	{
		return "Details \n " +super.toString()+ "\n  performance bonus =\t " +performance_bonus ;
	}
	
	public double getperformancebonus()
	{
		return performance_bonus;
	}
	
	@Override
	public double compute_netsalary()
	{
		double netsalary = super.basic + performance_bonus;
		return netsalary;
	}
}


