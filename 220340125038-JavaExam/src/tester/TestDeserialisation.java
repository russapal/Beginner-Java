package tester;

import java.util.Map;
import java.util.Scanner;

import app.Banking;
import static utils.IOUtils.restoreTransactionDetails;


public class TestDeserialisation 
{
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in))
		{
			
			System.out.println("Enter file name");
			Map<Integer, Banking> map = restoreTransactionDetails(sc.next());
			System.out.println("Product details");
			map.forEach((k,v) -> System.out.println(v));
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
