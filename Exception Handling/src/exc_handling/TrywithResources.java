package exc_handling;

import java.util.Scanner;

public class TrywithResources {

	public static void main(String[] args) /* throws InterruptedException */{
		try(Scanner sc=new Scanner(System.in)) //gets executed
		{
			System.out.println("Enter a number");
			System.out.println("You entered "+sc.nextInt());
			Thread.sleep(1234);//sleeps down the process for secs and then prints main over
		} 
		catch (Exception e) {
			e.printStackTrace();//prints nothing as no exceptions or condition is applied
		}
		System.out.println("main over....");

	}

}
