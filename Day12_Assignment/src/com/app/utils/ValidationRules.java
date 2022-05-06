package com.app.utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.customer.PaymentOption;
import com.app.customer.Customer;

import com.app.exception.CustomerHandlingException;

import static com.app.customer.Customer.sdf;

public class ValidationRules {
	private static Date endDate;
	static {
		try {
			endDate = sdf.parse("1-1-2021");
		} catch (ParseException e) {
			System.out.println("err in static date " + e);
		}
	}

	
	public static Customer validateCustomerInputs(String name,String email, String password ,String paymentoption,
			double registration_amt, String dob, ArrayList<Customer> customers) throws CustomerHandlingException,ParseException
	{
		checkForDup(email, customers);
		checkpasswd(password);
		PaymentOption paymentoption1 = validate_paymentoption(paymentoption);
		Date dob1 = parseNValidateDate(dob);
		return new Customer(name,email,password, paymentoption1, registration_amt, dob1);		
	}
	
	
	
	public static PaymentOption validate_paymentoption(String paymentoption) throws CustomerHandlingException {
		try {
			return PaymentOption.valueOf(paymentoption);
		}catch(IllegalArgumentException e) {
			throw new CustomerHandlingException("Invalid payment option" +paymentoption);
		}
	}



	public static void checkpasswd(String password) throws CustomerHandlingException{
		if (password.length()<4 || password.length()>10) {
			throw new CustomerHandlingException("Password must be in 4 max 10 chars long");
		}
		else
			System.out.println("Valid Password");	
	}



	public static void checkForDup(String email, ArrayList<Customer> customers) throws CustomerHandlingException{
		Customer newCustomer = new Customer (email);
		for(Customer c: customers)
			if(c != null)
				if (c.equals(newCustomer)) {
					throw new CustomerHandlingException("Dup email !!!!!!!!!!!");		
					}
		if (!(email.contains("@") && email.endsWith(".com"))) {
			throw new CustomerHandlingException("Invalid Mail ID");
		}
}

	public static Date parseNValidateDate(String dob) throws ParseException, CustomerHandlingException {
		Date d1 = sdf.parse(dob);
		if (d1.after(endDate)) 
			throw new CustomerHandlingException("Invalid, too young !!!!!!!!!!!!!!");
		return d1;
	}
	
	/*public static Customer userlogin(String email,String password, ArrayList<Customer> customers)
			throws CustomerHandlingException
   {
		Customer newCustomer = new Customer(email,password);
		int index = Customer.indexOf(newCustomer);
		if (index == -1)
			throw new CustomerHandlingException("Invalid email or password : Customer not found!!!!!!!!!!!!");
		return customers.get(index);
	}*/
	
	public static void checkLogin(String email, String password, ArrayList<Customer> customers) throws CustomerHandlingException
	{
		Customer newCustomer = new Customer (email);
			if(customers.contains(newCustomer))
			{
				Customer existingcustomer = customers.get(customers.indexOf(newCustomer));
				if(!(existingcustomer.getpassword().equals(password)))
				{
					throw new CustomerHandlingException("Invalid Password !!!!!!!!!!!");	
				}
			
					throw new CustomerHandlingException("Customer with the Email isn't registered !!!!!!!!!!!");
	}
	}
	
	public static Customer chgpasswd (String email, String password, ArrayList<Customer> customers) throws CustomerHandlingException
	{
		Customer newCustomer = new Customer (email);
			checkForDup(email,customers);
			int custIndex=0;
			custIndex=customers.indexOf(newCustomer);
			Customer indexcust = customers.get(custIndex);
			if (!(indexcust.getpassword().equals(password)))
				throw new CustomerHandlingException("Invalid Password");
	else
		return indexcust;
	}
	
	public static Customer verifyMail(String email, ArrayList<Customer> customers) throws CustomerHandlingException
	{
		Customer c = new Customer (email);
		if (!(customers.contains(email)))
			throw new CustomerHandlingException("Invalid Email");
		else 
			return c;
	}
}
		
	

