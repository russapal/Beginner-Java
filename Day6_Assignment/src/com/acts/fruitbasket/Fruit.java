package com.acts.fruitbasket;

/* Inheritance (IS-A): Inherits the features (fields and method) of another class
 * Constructors can't be inherited. can be done using super keyword
 * Hierarchical Inheritance: (Apple , orange , mango inherit it 
 * Remember multiple inheritance and hybrid can only be achieved using interfaces*/

public class Fruit 
{
    String fruit;
    String taste;
	public Fruit(String fr)
    {
    	fruit = fr;
    }
	
	public Fruit()
	{
	} 

	@Override
     public String toString()
     {
		System.out.println("------------------------------------------");
		return  " Selected Fruit \t " +fruit+ "\n Tastes \t " +taste()+ "\n Colour \t " +colour();
     }
	//getter and overriding 
	public String getFruitname()
	{
		return fruit;
	}
	
	public String taste()
	{
		return "No specific taste";
	}
	
	public String colour()
	{
		return "No specific colour";
	}

}
