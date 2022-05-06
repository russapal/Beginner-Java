package com.acts.fruitbasket;

//Interfaces(IS-A) specifies what a class must do and how . Only (static constants and abstract methods) data member and method name along with signature is there in it , no other body elements
//need to use implement keyword. It is a way to achieve abstraction.

public class Mango extends Fruit
{
	
	public Mango(String fr)
	{
		super (fr);
		System.out.println("------------------------------------------");
		System.out.println("Mango is successfuly added");
		System.out.println("------------------------------------------");
		
	}
	
	public Mango()
	{
		
	}
	
	@Override
	public String toString()
	{
		return "Hi \n"+ super.toString();
	}
	
	public String taste()
	{
		return "Sweet and Sour";
	}
	
	public String colour()
	{
		return "Yellow";
	}

}
