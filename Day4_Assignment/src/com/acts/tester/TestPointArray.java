package com.acts.tester;
import java.util.Scanner;

import com.acts.geometry.Point;

import java.util.Arrays;

public class TestPointArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				int number_of_point_to_plot;
		System.out.println("Enter the no. of point to plot");
		//i/p for no. of points
		number_of_point_to_plot = sc.nextInt();
		
		//creation of array for class point based on i/p received from user for no of elements 
		Point [] pointArray = new Point[number_of_point_to_plot];
		
		//the loop will upto no. entered by user and collects x and y coordinates4
		for (int i=0; i<pointArray.length; i++)
		{
			System.out.println("Enter the x and y for " + i + "point");
			int xP1 = sc.nextInt();
			int yP1 = sc.nextInt();
			Point ap1 = new Point(xP1 , yP1);//creation of object
			pointArray[i] = ap1;//array value holds the value that object carries	
			
		}
		
		//o/p the elements entered in the array where its stored
		System.out.println("The number of points stored" + Arrays.toString(pointArray));
		
		for (Point p: pointArray)//for each loop: traveses through the array element one by one
		{
			System.out.println(p.toString());
		}
		
		//Ask the user which two indexes wants to compare and check if the points entered are same or different
		System.out.println("Enter the two inices you want to compare starts from 0 and ends to");
		int firstIndex = sc.nextInt(); // ask for first index
		int secondIndex = sc.nextInt(); //ask for second index
		
		if ( firstIndex < pointArray.length && firstIndex >= 0 && secondIndex < pointArray.length && secondIndex >0)
		{ //condition that index is greater then 1 but less then the no. of elements or index entered by the user coz array gets initialized from 0 .
			if (pointArray[firstIndex].isEqual(pointArray[secondIndex])) 
			{
			System.out.println("Both points are equal");
			}
			
			else 
			{
			System.out.println("Both are different");	
			}
			
		}	
		
		else 
		{
			System.out.println("Invalid index entered");	
		}
		sc.close();
	}

}
