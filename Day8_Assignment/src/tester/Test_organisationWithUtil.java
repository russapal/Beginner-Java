package tester;

import java.util.Scanner;
import com.app.util.EmpUtil;

import com.app.exception.CustomException;
import com.app.org.Emp;
import com.app.org.Mrg;
import com.app.org.Worker;

public class Test_organisationWithUtil 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Emp profiles");
		Emp[] selection= new Emp[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		while(!exit)
		{
			System.out.println("------------------------------------------");
			System.out.println("\t  Welcome \t");
			System.out.println("------------------------------------------");
			System.out.println("1. Hire Manager \n 2. Hire Worker  \n 3. Display all employee info \n 4. Update Salary \n 5. exit");
			System.out.println("------------------------------------------");
			System.out.println("Choose please ");
			
		switch(sc.nextInt())
		{
		case 1:
			if(counter < selection.length)
			{
				System.out.println("Enter the Manager name , deptt, basic and performance based salary details");
				selection [counter++] =new Mrg(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
			}
			else
				System.out.println("Sorry facility not available");
			break;
			
		case 2:
			if(counter < selection.length)
			{
				System.out.println("Enter the Worker name , deptt, basic , hourly work and hourly rate details");
				selection [counter++] =new Worker(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			}
			else
				System.out.println("Sorry facility not available");
			break;
			
			
		case 3: 
			System.out.println("------------------------------------------");
			System.out.println("Total no. of employees hired \t " +selection.length);
			System.out.println("\t Selected Emp details \t ");
			for (Emp f: selection)
				if (f != null)
				{
					if(f instanceof Mrg)
					{
						System.out.println(f.toString());
						System.out.println("Performance Bonus = \t" +((Mrg)f).getperformancebonus());
						System.out.println("Net Salary = \t" +((Mrg)f).compute_netsalary());
						System.out.println("------------------------------------------");
					}
					else 
					{
						System.out.println(f.toString());
						System.out.println("Hours Rate = \t" +((Worker)f).gethourlyrate());
						System.out.println("Net Salary = \t" +((Worker)f).compute_netsalary());
						System.out.println("------------------------------------------");
					}
				}
					
			break;
		
		case 4:
			System.out.println("------------------------------------------");
			System.out.println(" \t Update salary \t");
			System.out.println("Enter emp id and increment component");
			int id=sc.nextInt();
			int inc=sc.nextInt();
			
			boolean empfound = false;
			try {
			for (int i= 0; i<selection.length;i++) 
			{
				if(selection[i] != null) 
				{
					if (selection[i].getid()==id)
					{
						empfound=true;
						EmpUtil.validateSalary(inc);// check the increment via util class
						selection[i].setbasic(selection[i].getbasicsalary()+inc);
						break;
						
					}
				}
			}
			if(!empfound){
				throw new CustomException("Id does not exists");
			}
			}
			catch(CustomException e){
				System.out.println(e.getMessage());
			}
		
			break;
			
		case 5:
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
