package com.acts.fruitbasket;

public class Orange extends Fruit
{
	
	public Orange (String fr)
	{
		super (fr);
		System.out.println("------------------------------------------");
		System.out.println("orange is successfuly added");
		System.out.println("------------------------------------------");
		
	}
	
	public Orange()
	{
		
	}
	
	@Override
	public String toString()
	{
		return "Hi \n"+ super.toString();
	}
	
	public String taste()
	{
		return " Sour";
	}
	
	public String colour()
	{
		return "Orange";
	}

}
