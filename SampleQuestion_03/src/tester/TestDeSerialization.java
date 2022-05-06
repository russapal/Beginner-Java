package tester;

import java.util.Map;
import java.util.Scanner;

import app.StudentDetails;

import static utils.IOUtils.restoreProductDetails;


public class TestDeSerialization {
	
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in))
		{
			
			System.out.println("Enter file name");
			Map<Integer, StudentDetails> map = restoreProductDetails(sc.next());
			System.out.println("Product details");
			map.forEach((k,v) -> System.out.println(v));
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
