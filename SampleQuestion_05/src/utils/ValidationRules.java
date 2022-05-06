package utils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import practice.Product;

import custom_handling.CustomException;

import static practice.Product.sdf;

public class ValidationRules 
{
	private static Date endDate;
	static {
		try {
			endDate = sdf.parse("31-3-2022");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// add static method (which will be invoked by tester) to validate all i/ps
	public static Product validateInputs(String id, String name ,String edate , double price,
			ArrayList<Product> prods) throws CustomException, ParseException {
		checkForDup(id, prods);
		// => no dup detected!
		Date Expiredate = parseNValidateDate(edate);
		// => date is valid
		return new Product(id,name,Expiredate,price);
	}

	// add static method for chking dup chasis nos
	public static void checkForDup(String id, ArrayList<Product> prods) throws CustomException {
		// create vehicle instance to wrap PK : chasis no
		Product newProduct = new Product(id);
		// how to chk for dups ? Use AL API
		// public boolean contains(Object o)
		if (prods.contains(newProduct))
			throw new CustomException("Dup entry !!!!!!!!!!!");
	}


	// add static method to parse n validate the manu. date
	public static Date parseNValidateDate(String edate) throws ParseException, CustomException {
		// parsing : string --> Date
		Date d1 = sdf.parse(edate);
		// => parsing is successful !
		if ( d1.after(endDate)) // validation
			throw new CustomException("Expired !!!!!!!!!!!!!!");
		// => parsing n validation successful !
		return d1;
	}

	// add static method to find vehicle by it's chasis no
	public static Product findProductByid(String id, ArrayList<Product> selected)
			throws CustomException {
		// 1. wrap chasis no in a vehicle instance
		Product newProduct = new Product(id);
		// 2 . find out index of 1st occurrence of the match
		// public int indexOf(Object o)
		int index = selected.indexOf(newProduct);
		if (index == -1)// => no vehicle by chasis no found :
			throw new CustomException("Invalid ID No : Product not found!!!!!!!!!!!!");
		//=> vehicle is found	
		// 3 . AL's get
		// public E get(int index)
		return selected.get(index);
	}

}
