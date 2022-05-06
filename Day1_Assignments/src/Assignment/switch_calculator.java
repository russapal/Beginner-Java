package Assignment;
import java.util.Scanner;

public class switch_calculator {
	
	public static void main(String[] args) 
	{ /* Static Method: Belongs to class
	Can be invoked without creation of object
	can call and change value static data members
	Cannot call non-static data members
	this and super keyword cannot be used*/
		int choice;
		Scanner sc = new Scanner (System.in); //if passed with a method then scanner close isn't require
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Quit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter a two no.s for addition:");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int sum = a+b;
				System.out.println("Addition = " + sum);
				break;
			
			case 2:
				System.out.println("Enter a two no.s for subtraction:");
				int c = sc.nextInt();
				int d = sc.nextInt();
				int sub = c-d;
				System.out.println("Subtraction = " + sub);
				break;
				
			case 3:
				System.out.println("Enter a two no.s for multiplication:");
				int e = sc.nextInt();
				int f = sc.nextInt();
				int product = e*f;
				System.out.println("Multiplication = " + product);
				break;
				
			case 4:
				System.out.println("Enter a two no.s for division:");
				int g = sc.nextInt();
				int h = sc.nextInt();
				int divi = g/h;
				System.out.println("Result = " + divi);
				break;
				
			case 5:
				System.out.println("loop ended");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Option");
				break;
			}
		}
		while (choice <=7);
		sc.close();
	}

}
