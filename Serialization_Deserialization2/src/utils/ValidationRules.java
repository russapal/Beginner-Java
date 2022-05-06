package utils;

	import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
	import java.util.Date;

import app.Category;
import app.Product;

	import custom_handling.CustomException;

	import static app.Product.sdf;

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

		
	/*	public static Product validateInputs(int id, String name , Category productcategory, String edate , double price,
				ArrayList<Product> prods) throws CustomException, ParseException {
			checkForDup(name, prods);
			
		//	LocalDate Expiredate = parseNValidateDate(edate);
			
			return new Product(id,name,productcategory,edate,price);
		}*/

		
		public static void checkForDup(String name, ArrayList<Product> prods) throws CustomException {
		
			Product newProduct = new Product(name);
		
			if (prods.contains(newProduct))
				throw new CustomException("Dup entry !!!!!!!!!!!");
		}


		
		/*public static LocalDate parseNValidateDate(String edate) throws ParseException, CustomException {
			
			LocalDate d1 = sdf.parse(edate);
			
			if ( d1.after(endDate))
				throw new CustomException("Expired !!!!!!!!!!!!!!");
			
			return d1;
		}*/

		
		public static Product findProductByid(String name, ArrayList<Product> selected)
				throws CustomException {
			
			Product newProduct = new Product(name);
		
			int index = selected.indexOf(newProduct);
			if (index == -1)
				throw new CustomException("Invalid name : Product not found!!!!!!!!!!!!");
			
			return selected.get(index);
		}

	}


