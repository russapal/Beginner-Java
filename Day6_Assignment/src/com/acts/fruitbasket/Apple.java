package com.acts.fruitbasket;

public class Apple extends Fruit //extend keyword is used by subclass to inherit the property of base/parent class
{
	
	public Apple(String fr)
	{
		super (fr); //Invoking of the base class constructor
		//A superclass (base) can have multiple subclass but subclasses can have only one super class . 
		System.out.println("------------------------------------------");
		System.out.println("Apple is successfuly added");
		System.out.println("------------------------------------------");
	}
	
	public Apple()
	{
		
	}
	
	@Override //new instance method having the same signature as in superclass
	public String toString()
	{
		return "Hi \n "+ super.toString();
	}
	
	public String taste()
	{
		return "Sweet";
	}
	
	public String colour()
	{
		return "Red";
	}

}
