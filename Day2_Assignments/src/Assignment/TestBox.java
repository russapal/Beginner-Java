package Assignment;
import java.util.Scanner;

public class TestBox //blueprint or prototype from which objects are created
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Box b1;
		System.out.println("Enter the side");
		b1 = new Box (sc.nextDouble()); // dynamically allocates memory
		System.out.println("Vol of cube = " +b1.getboxvol());
		
		Box b2;
		System.out.println("Enter the side");
		b2 = new Box (sc.nextDouble());
		System.out.println("Vol of cube = " +b2.getboxvol());
		
		if (b1.side == b2.side)
		{
			System.out.println("True");
		}
		
		else 
		{
			System.out.println("False");
		}
		
		sc.close();
		
	}

}

class Box
{
	double side;
	
	Box (double s)
	{
		side = s;
	}
	
	String getBoxdims()
	{
		return "Box Dimension" +side;
	}
	
	double getboxvol()
	{
		return side*side*side;
	}
}
