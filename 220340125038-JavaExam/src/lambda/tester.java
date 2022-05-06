package lambda;

import static utils.CollectionUtils.*;

import java.util.Map;

import app.Banking;

public class tester 
{
	public static void main(String[] args) {
		// get populated map from CollectionUtils
		Map<Integer, Banking> products = populateMapFromList(populateList());
		//display all product details from the map
		products.forEach((k,v) -> System.out.println("Key "+k+" : "+"Value "+v));

	}
	

}
