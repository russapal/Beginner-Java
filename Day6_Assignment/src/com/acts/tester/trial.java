package com.acts.tester;
import com.acts.fruitbasket.Apple;
import com.acts.fruitbasket.Orange;
import com.acts.fruitbasket.Mango;

public class trial 
{
  public static void main (String[] args)
  {
	  Apple apple1 = new Apple("apple");
	  System.out.println(apple1);
	 
	  Mango mango1 = new Mango("mango");
	  System.out.println(mango1);
	  
	  Orange orange1 = new Orange("orange");
	  System.out.println(orange1);
  }
}
