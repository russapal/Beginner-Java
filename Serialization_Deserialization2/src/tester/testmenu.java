package tester;
	import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Comparator;
 import java.util.HashMap;
import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.stream.Collectors;

	import app.Category;
	import app.Product;
import custom_handling.CustomException;
     


	public class testmenu
	{
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
                
				Map<String , Product> products = new HashMap<>();

				boolean exit = false;
				while (!exit) {
					System.out.println(
							"Options 1. Add Student 2. Display Student details 3.Display specific student details "
							+ " 6. Delete Student Details  9.Sort students as per registration date 100. Exit");
					System.out.println("Choose Option");
					try {
						switch (sc.nextInt()) {
						/*case 1:
							System.out.println(
									"Enter new student details : id , name , age , Registration date , course");
							Product pd = new Product(sc.nextInt(), sc.next(), Category.valueOf(sc.next()), null, sc.nextDouble());
							products.put(pd.getName(),pd);
							System.out.println("Student added to the list ....................");
							break;*/
						
						case 2:
							System.out.println("Student details");
							List<Product> list = populateList();	
							list.forEach(p -> System.out.println(p));
							break;
						
						case 3:
							
							List<Product> lists = populateList();
							System.out.println("Enter category");
							Category cat=Category.valueOf(sc.next().toUpperCase());
					
						
							 Map<Integer, Product> map = lists.stream() 
							.filter(p -> p.getProductCatgeory() == cat) 
							
							.collect(Collectors.toMap(p->p.getId(),p->p));
							 map.forEach((k,v) -> System.out.println(v));
							break;
							
						case 4:
							System.out.println("Sorting on date");
							List<Product> li = populateList();
							System.out.println("Enter category");
							Category cate=Category.valueOf(sc.next().toUpperCase());
							
							Comparator<Product>  prodC =(p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
							List<Product> collectedProducts = li.stream() 
		
									.filter(p -> p.getProductCatgeory() == cate) 
									.sorted(prodC)
									.collect(Collectors.toList());
							collectedProducts.forEach(p -> System.out.println(p));
							break;
							
						case 5:
							System.out.println("Sorting on price");
							List<Product> lis = populateList();	
							System.out.println("Enter category");
							Category category=Category.valueOf(sc.next().toUpperCase());
							System.out.println("Filtered list");
						
							lis.stream() 
					
							.filter(p -> p.getProductCatgeory() == category) 
							.sorted((p1,p2) -> ((Double)p2.getPrice()) .compareTo(p1.getPrice()))
							.forEach(p -> System.out.println(p));
							break;
					
						/*case 6:
							System.out.println("Enter Id , to delete employee details");
							Product v1 = new Product(sc.next());
							// 1 . indexOf
							int index = products.indexOf(v1);
							if (index == -1)
								throw new CustomException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
							System.out.println("Removed details of " + products.remove(index));
							break;*/
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
