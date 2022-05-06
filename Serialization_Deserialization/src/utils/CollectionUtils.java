package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.Product;

import static app.Category.*;
import static java.time.LocalDate.*;

public interface CollectionUtils 
{
	 static List<Product> populateList() {
			ArrayList<Product> products = new ArrayList<>();
			products.add(new Product(100, "mango", FRUITS, parse("2019-01-01"), 500));
			products.add(new Product(10, "rice_bran", OIL, parse("2019-11-21"), 450));
			products.add(new Product(45, "sunflower", OIL, parse("2019-05-11"), 550));
			products.add(new Product(30, "rice", GRAINS, parse("2019-01-13"), 520));
			products.add(new Product(55, "orange", FRUITS, parse("2020-01-01"), 350));
			products.add(new Product(35, "wheat", GRAINS, parse("2018-07-11"), 700));
			products.add(new Product(32, "maize", GRAINS, parse("2020-01-13"), 510));
			products.add(new Product(50, "apple", FRUITS, parse("2020-09-01"), 360));
			products.add(new Product(75, "barley", GRAINS, parse("2019-11-21"), 460));
			return products;
		}
	
		static Map<Integer,Product> populateMapFromList(List<Product> products)
		{
			Map<Integer,Product> map=new HashMap<>();
			
			products.forEach(p -> map.put(p.getId(), p));
			return map;
				
		}

}
