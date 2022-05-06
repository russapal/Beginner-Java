package com.acts.tester;
import java.util.Scanner;

import com.acts.geometry.Point;

public class TestPoint {
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter x and y coordinates for p1");
		
		//creation of p1 object for class point
		Point p1= new Point(sc.nextDouble(),sc.nextDouble());
		
		//show function is called by the help of object p1 shows the x and y coordinate
		System.out.println(p1.show());
		
		System.out.println("Enter x and y coordinates for p2");
		Point p2= new Point(sc.nextDouble(),sc.nextDouble());
		
		System.out.println(p2.show());
		
		if (p1.isEqual(p2))
			System.out.println("Both are same");
		else
			System.out.println ("Both are different");
		
		sc.close();
		
	}

}
