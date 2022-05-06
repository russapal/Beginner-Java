package com.acts.geometry;

public class Point {
	public double x_coordinate, y_coordinate;
	public Point (double x, double y)// Constructor: special method to initialize the objects. Called upon creation of object
	//must have same name as class. Called only once : when object is created , do not have any return type
	{
		this.x_coordinate=x;
		this .y_coordinate=y;
	}
	
	public String show()
	{
		return "x_coordinate:" + x_coordinate +  "y_coordinate:" + y_coordinate;
	}
	public boolean isEqual (Point other)
	{
		return x_coordinate == other. x_coordinate && y_coordinate == other. y_coordinate;
	}

}
