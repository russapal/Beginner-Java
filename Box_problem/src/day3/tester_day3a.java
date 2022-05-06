package day3;
import java.util.Scanner;

public class tester_day3a 
{
	public static void main(String[] args)
	{
			//create scanner instance to attach to stdin
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter side of a cube");
	   box cube=new box(sc.nextDouble());// object1 creation with parameterised constructor aka constructor chaining is done.
	   System.out.println(cube.getBoxDims());
	   System.out.println(cube.getVolume());
	   
	   box defBox=new box();//object2 creation with constructor overloading 
	    System.out.println(defBox.getBoxDims()); //o/p: -1 , -1 , -1
	    System.out.println(defBox.getVolume());
		sc.close();
	}

}
