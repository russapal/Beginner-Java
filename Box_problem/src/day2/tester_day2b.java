package day2;
import java.util.Scanner;

public class tester_day2b 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		box b1; // gives compilation error if created in another package and obj is not created yet
		
		System.out.println("Enter width depth and height values");
		b1 =new box (sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		
		System.out.println(b1.getBoxDims());
		System.out.println("Vol of the box = " +b1.getVolume());
		System.out.println(b1);
		
		box b2=b1; //copy reference
				System.out.println(b2);
		System.out.println(b2.getBoxDims()); //o/ps the same values as b1 
		System.out.println("Volume " +b2.getVolume());
		
		b1 = null; //nullify the reference what is reference here??
		//System.out.println(b1.getBoxDims());//null pointer exception
		System.out.println("Code continues");
		
		b2 = null;
		//System.out.println(b2.getBoxDims());//null pointer exception (runtime error?)
		System.out.println("Code continues");
		sc.close();
		
	}

	
}
