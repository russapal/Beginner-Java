package day3;
import java.util.Scanner;
public class tester_day3b 
{
	public static void main(String[] args)
	{
			//create scanner instance to attach to stdin
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter box dims");
	   
	   box b1=new box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//object creation and parameterised constructor is called
	   System.out.println(b1.getBoxDims());
	    System.out.println("Enter box dims");
	    
	   box b2=new box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());// second object created
	    System.out.println(b2.getBoxDims()); 
		//print if boxes are equal : SAME , o.w : DIFFERENT
	//	System.out.println(b1.isEqual(b2)); // normal if else
	/*if(b1.isEqual(b2))
		System.out.println("SAME");
	else 
		System.out.println("DIFFERENT");*/
	System.out.println(b1.isEqual(b2)?"SAME":"DIFFERENT"); // using ternary 
		
		sc.close();
	}
}

