package tester;

import java.util.Map;
import java.util.Scanner;

import app.Banking;

import static utils.CollectionUtils.*;
import static utils.IOUtils.storeTransactionDetails;

public class TestSerialisation 
{
	public static void main(String[] args) {
	try(Scanner sc =new Scanner(System.in))
	{
		Map<Integer, Banking> map = populateMapFromList(populateList());
		System.out.println("Enter file name");
		storeTransactionDetails(map, sc.next());
		System.out.println("data stored ....");			
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}
