package tester;

import static utils.CollectionUtils.populateList;

	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.stream.Collectors;

	import app.Category;
	import app.Product;
     
	public class TestFunctional {
		public static void main(String[] args) {
			try(Scanner sc=new Scanner(System.in))
			{
			// get populated list of products from CollectionUtils
				List<Product> list = populateList();	
				System.out.println("original list ");
				list.forEach(p -> System.out.println(p));
				System.out.println("Enter category");
				Category cat=Category.valueOf(sc.next().toUpperCase());
		
				Comparator<Product>  prodComp =(p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
			
				 Map<Integer, Product> map = list.stream() 
				.filter(p -> p.getProductCatgeory() == cat) //Stream<Product> : filtered by category products
				.sorted(prodComp)
				.collect(Collectors.toMap(p->p.getId(),p->p));//terminal op : collect
				System.out.println("what will be o/p?");
				list.forEach(p -> System.out.println(p));//original list
				System.out.println("what will be o/p?");
				map.forEach((k,v) -> System.out.println(v));//filtered n un sorted map of products
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

