package tester;

import java.util.Map;
import java.util.Scanner;

import app.Product;

import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

public class TestSerialization 
{
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in))
		{
			//get product detail from collection utils
			Map<Integer, Product> map = populateMapFromList(populateList());
			System.out.println("Enter file name");
			storeProductDetails(map, sc.next());
			System.out.println("data stored ....");			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
