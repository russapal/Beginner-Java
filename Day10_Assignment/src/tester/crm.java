package tester;
import static com.app.customer.Customer.sdf;

import java.util.Arrays;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.customer.PaymentOption;
import com.app.exception.CustomerHandlingException;
import com.app.utils.ValidationRules;
import static com.app.utils.ValidationRules.validateCustomerInputs;
public class crm {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Customer for registration");
		Customer[] entry= new Customer[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		while(!exit)
		{
			System.out.println("------------------------------------------");
			System.out.println("\t Welcome \t");
			System.out.println("------------------------------------------");
			System.out.println("1. Customer Registration \n  2. Display all Customer info\n 3. Exit");
			System.out.println("------------------------------------------");
			System.out.println("Choose please ");
			try {
				switch(sc.nextInt())
				{
				case 1:
					if(counter < entry.length)
					{
						System.out.println("Enter the Customer name , email, password , payment option , registration amount"
								+ " and date of birth");
						Customer new_c =validateCustomerInputs(sc.next(),sc.next(),sc.next() ,sc.next() , sc.nextDouble(), sc.next(), entry);
						entry [counter] = new_c;
						counter++;
						System.out.println("-----------------------------------------");
						System.out.println("\t New Customer added \t");
						System.out.println("------------------------------------------");
					}
					else
						throw new CustomerHandlingException("Maximum Capacity Reached");
					break;
								
				case 2: 
					System.out.println("------------------------------------------");
					System.out.println("Total no. of Registerd Customer \t " +entry.length);
					System.out.println("\t Registerd Customer details \t ");
					for (Customer c: entry) {
						if (c != null)
						{
								System.out.println(c);
						}
					}
				break;	
				
				case 3: 
					System.out.println("Ended the menu");
					System.out.println("------------------------------------------");
					System.exit(0);	
					break;
					
				default:
					System.out.println("Invalid Option");
					break;
				
				}
			}catch(Exception ex) {
				if(ex instanceof CustomerHandlingException) {
					System.out.println(ex.getMessage());
				} else {
					ex.printStackTrace();
				}
			}
		}
		sc.close();
	}

}
