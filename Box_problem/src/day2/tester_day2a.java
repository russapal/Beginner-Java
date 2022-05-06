package day2;
import java.util.Scanner;

public class tester_day2a 
{
	
	public static void main (String[] args)
	{
		int data=100; // primitive datatype ( types: byte(1),short/char(2),int/float(4) and long/double(8) they are allocated memory in stack
		Scanner sc= new Scanner(System.in);
		
		box b1; // memory is allocated for storing a reference type of variable in the main's stack and object is not created yet
		System.out.println("Enter width depth and height values");
		b1 =new box (sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		/*another way of object creation and is allocated in heap memory*/
		
		
		//System.out.println(b1.width); will show compilation err as it is private data member
		
		System.out.println(b1.getBoxDims());
		System.out.println("Vol. of the box" +b1.getVolume());
		/* here you will get error if it is put in different package due to not using public keyword in box class
		 * if the constructor is and function getVolume is made public there will be no error*/
		
		System.out.println(b1);
		sc.close();
		
	}

}
