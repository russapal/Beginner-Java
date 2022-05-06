package utils;
import custom_exceptions.SpeedOutofRangeException;

public class SpeedUtils 
{
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
//static init block
	static {
		MIN_SPEED = 30;
		MAX_SPEED = 80;
	}
	//add static method to validate speed of a vehicle
	public static void validateSpeed(int speed) throws SpeedOutofRangeException
	{
		if(speed <= MIN_SPEED)
			throw new SpeedOutofRangeException("You are driving too slow!!!!!!!!!!!!");
		//=> speed > MIN speed
		if(speed >= MAX_SPEED)
			throw new SpeedOutofRangeException("You are driving too Fast , FATAL !!!!!!!!!!");
		System.out.println("speed within range...");
	}

}
