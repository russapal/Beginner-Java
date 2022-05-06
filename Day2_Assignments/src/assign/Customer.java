package assign;

import java.util.Scanner;

public class Customer {

 int age;
 String name;
 String email;
 double CreditLimit;
 
/* Customer() //using constructor
 * {
 * }
 * public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the email :: ");
  email = in.next();
  System.out.print("Enter the age :: ");
  age = in.nextInt();
  System.out.print("Enter the CreditLimit :: ");
  CreditLimit = in.nextDouble();
 }
 
 public void display() 
 {
  
  System.out.println("Customer name = " + name);
  System.out.println("Customer email = " + email);
 }*/
 
 //using getter and seeter
	public int getAge() { //getter for age
		if ((age >= 21) && (age <= 61))
			 
		 {
		  System.out.println("Customer age = " );
	  }
	  else {
		  System.out.println(" Out of bound age = " );
	  }
	    return age;  
	}  
	
	
	public void setAge(int age) {  
		this.age = age; 
	}  
	
	public double getCreditLimit() {  
		if ((CreditLimit >= 5000) && (CreditLimit <= 50000))
		{
			  System.out.println("Out of bound , credit limit = " );
		  }
		  else
			  System.out.println("Customer CreditLimit = " );
	    return CreditLimit;  
	}  
	public void setCreditLimit(double CreditLimit) {  
	    this.CreditLimit = CreditLimit;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getemail() {  
	    return email;  
	}  
	public void setemail(String email) {  
	    this.email = email;  
	} 
 
 public void display_age()
  {
	 if ((age >= 21) && (age <= 61))
 
	 {
	  System.out.println("Customer age = " + age);
  }
  else {
	  System.out.println(" Out of bound age = " + age);
  }
  }
 
 public void display_credit()
 {
  
  if ((CreditLimit >= 5000) && (CreditLimit <= 50000))
  {
	  System.out.println("Out of bound , credit limit = " + CreditLimit);
  }
  else
	  System.out.println("Customer CreditLimit = " + CreditLimit);
 }
 
 public static void main(String[] args) {
 
  /*Customer c1 = new Customer();
  c1.getInput();
  System.out.println("**** Data Entered as below ****");
   c1.display();
   c1.display_age();
   c1.display_credit();*/
  
	 Customer c2 = new Customer(); //object creation : object is instance of class. used for interaction by class. 
	 //created using new keyword for eg: Dog = object
	 //identity= name of dog
	 //State/Attributes: Age , breed , colour
	 //behaviour: bark ,sleep 
	Scanner in = new Scanner(System.in);
	  System.out.print("Enter the name :: ");
	  c2.setName(in.next());
	  System.out.print("Enter the email :: ");
	  c2.setemail(in.next());//behaviour takes input , attribute email
	  System.out.print("Enter the age :: ");
	  c2.setAge(in.nextInt());
	  System.out.print("Enter the credit limit:: ");
	  c2.setCreditLimit(in.nextInt());
	  
	  System.out.println("**** Data Entered as below ****");
	  System.out.print("Name :: ");
	  System.out.print(c2.getName());
	  System.out.print("Email :: ");
	  System.out.print(c2.getemail());
	  System.out.println("Age :: ");
	  System.out.println(c2.getAge());
	  System.out.println("Credit limit:: ");
	  System.out.println(c2.getCreditLimit());
	  
	  in.close();
	  
 }
}