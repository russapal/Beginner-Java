package com.acts.tester;
import com.acts.fruitbasket.Fruit;
import com.acts.fruitbasket.Apple;
import com.acts.fruitbasket.Mango;
import com.acts.fruitbasket.Orange;
import java.util.Scanner;

public class tester {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max no of fruits");
		Fruit[] selection= new Fruit[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		while(!exit)
		{
			System.out.println("------------------------------------------");
			System.out.println("\t Menu \t ");
			System.out.println("------------------------------------------");
			System.out.println("1. Apple \n 2. Mango \n 3. Orange \n 4. Display all fruit details \n 5. Display specific"
					+ "fruit details \n 6. exit");
			System.out.println("------------------------------------------");
			
			System.out.println("Choose please ");
			
		switch(sc.nextInt())
		{
		case 1:
			if(counter < selection.length)
			{
				System.out.println("Confirm your seletion by typing the fruit name same as in menu");
				selection [counter++] =new  Apple (sc.next());
				
			}
			else
				System.out.println("Error : Please check the menu and spelling");
			break;
			
		case 2:
			if(counter < selection.length)
			{
				System.out.println("Confirm your seletion by typing the fruit name same as in menu");
				selection [counter++] =new  Mango (sc.next());
			}
			else
				System.out.println("Error : Please check the menu and spelling");
			break;
			
		case 3:
			if(counter < selection.length)
			{
				System.out.println("Confirm your seletion by typing the fruit name same as in menu");
				selection [counter++] =new  Orange (sc.next());
			}
			else
				System.out.println("Error : Please check the menu and spelling");
			break;
			
		case 4: 
			System.out.println("------------------------------------------");
			System.out.println("The total no. of selected fruits =" +selection.length);
			System.out.println("Selected fruit details");
			for (Fruit f: selection)
				if (f != null)
			    	System.out.println(f);
			break;
		
		case 5:
			System.out.println("Enter serial no of the fruit by which user entered");
			int index = sc.nextInt() -1;
			if (index >= 0 && index < counter)
			
				System.out.println(selection[index]);
			else
				System.out.println("Invalid no.");
			break;
			
		case 6:
			System.out.println("Ended the menu");
			System.out.println("------------------------------------------");
			System.exit(0);	
			break;
			
		default:
			System.out.println("Invalid Option");
			break;
		
		}
		}
		sc.close();
	}
}
	
