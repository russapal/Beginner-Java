package tester;
import static com.app.customer.Customer.sdf;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.customer.PaymentOption;
import com.app.exception.CustomerHandlingException;
import com.app.utils.ValidationRules;
import static com.app.utils.ValidationRules.validateCustomerInputs;
public class testmain {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<>();
		
		boolean exit = false;
		while(!exit)
		{
			System.out.println("------------------------------------------");
			System.out.println("\t Welcome \t");
			System.out.println("------------------------------------------");
			System.out.println("1. Customer Registration \n  2. Display all Customer info\n 3. Customer Login  \n 4. Update Password  \n 5.Unsubscribe");
			System.out.println("------------------------------------------");
			System.out.println("Choose please ");
			try {
				switch(sc.nextInt())
				{
				case 1:
						System.out.println("Enter the Customer name , email, password , payment option , registration ammount"
								+ " and date of birth");
						Customer cust =validateCustomerInputs(sc.next(),sc.next(),sc.next() ,sc.next() , sc.nextDouble(), sc.next(),customers);
						customers.add(cust);
						System.out.println("-----------------------------------------");
						System.out.println("\t New Customer added \t");
						System.out.println("------------------------------------------");
					break;
								
				case 2: 
					System.out.println("------------------------------------------");
					System.out.println("\t Registerd Customer details \t ");
					for (Customer c: customers) {
						if (c != null)
						{
								System.out.println(c);
						}
						else 
							System.out.println("No details found please check again");
					}
				break;
				
				case 3:
					System.out.println("Enter email and password");
					ValidationRules.checkLogin(sc.next(), sc.next(), customers);
					System.out.println("Login Successful");
					break;
				
				case 4:
					System.out.println("Enter email and password");
					Customer existCust = ValidationRules.chgpasswd(sc.next(), sc.next(), customers);
					System.out.println("Enter Password");
					existCust.setpassword(sc.next());
					System.out.println("Password Changed");
					break;
					
				case 5: 
					System.out.println("Enter Email");
					Customer ecust = ValidationRules.verifyMail(sc.next(), customers);
					int index = customers.indexOf(ecust);
					System.out.println("Customer Unsubscribed");
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
