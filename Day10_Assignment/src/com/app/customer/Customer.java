package com.app.customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private PaymentOption paymentoption;// HAS-A
	private double registration_amt;
	private Date dob;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	public Customer(String name,String email,String password, PaymentOption paymentOption2, double r, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.paymentoption = paymentOption2;
		this.registration_amt = r;
		this.dob = dob;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [Name =" + name + " Email =" + email + " Password =" + password +", Payment Option=" +paymentoption + ", Registration Amount=" 
	+ registration_amt + ", Date of Birth="+ sdf.format(dob) + "]";
	}
	
	/*@Override
	public boolean equals(Object duplicateCustomer) {
		System.out.println("in duplicate Customer");
		if (duplicateCustomer instanceof Customer)
			return this.email.equals(((Customer) duplicateCustomer).email);
		return false;

	}*/
}
