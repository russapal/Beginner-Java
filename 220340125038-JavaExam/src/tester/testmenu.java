package tester;
	import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Comparator;
 import java.util.HashMap;
import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.stream.Collectors;

	import app.TransactionType;
	import app.Banking;
import custom_handling.CustomException;
     


	public class testmenu
	{
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
                
				Map<String , Banking> transactions = new HashMap<>();

				boolean exit = false;
				while (!exit) {
					System.out.println(
							"Options 1. Display All Transaction details \n 2.Display specific transaction details "
							+ "\n  3.Sort transactions as per Transaction date \n  4. Sum of deposit Amount "
							+ "\n 5.Max Deposit Amount \n 6.Max Withdrawal date\n 100. Exit");
					System.out.println("Choose Option");
					try {
						switch (sc.nextInt()) {
												
						case 1:
							System.out.println("Transaction details");
							List<Banking> list = populateList();	
							list.forEach(p -> System.out.println(p));
							break;
						
						case 2:
							
							List<Banking> lists = populateList();
							System.out.println("Enter Transaction");
							TransactionType cat=TransactionType.valueOf(sc.next().toUpperCase());
					
						
							 Map<Integer, Banking> map = lists.stream() 
							.filter(p -> p.getNarration() == cat) 
							
							.collect(Collectors.toMap(p->p.getId(),p->p));
							 map.forEach((k,v) -> System.out.println(v));
							break;
							
						case 3:
							System.out.println("Sorting on date");
							List<Banking> li = populateList();
							System.out.println("Enter Transaction type");
							TransactionType cate=TransactionType.valueOf(sc.next().toUpperCase());
							
							Comparator<Banking>  tranC =(p1,p2) -> p1.getTransactionDate().compareTo(p2.getTransactionDate());
							List<Banking> collectedTransaction = li.stream() 
		
									.filter(p -> p.getNarration() == cate) 
									.sorted(tranC)
									.collect(Collectors.toList());
							collectedTransaction.forEach(p -> System.out.println(p));
							break;
							
						case 4:
							List<Banking> sumOfDeposit = populateList();
							System.out.println("Sum of Deposit " + sumOfDeposit.stream()
							
							.mapToDouble(p -> p.getDepositAmount())
											.sum());    
						break;
						
						case 5:
							List<Banking> maxOfDeposit = populateList();
							System.out.println(
									"Max Deposit amount" + maxOfDeposit.stream()
							.mapToDouble(p -> p.getDepositAmount())
											.max());
						
		
						
						case 6:
							System.out.println("Sorting on withdrawal amount from max to min");
							List<Banking> wa = populateList();	
						
							wa.stream() 
					
						.sorted((p1,p2) -> ((Double)p2.getWithdrawlAmount()) .compareTo(p1.getWithdrawlAmount()))
							.forEach(p -> System.out.println(p));
							break;
					
							
						
						case 100:
							exit = true;
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
						
					}
					
					sc.nextLine();

				}
			} // JVM auto close sc.close()

	}

}
