package utils;

import static java.time.LocalDate.parse;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.Vehicle;
import custom_handling.CustomException;

import static utils.ValidatationRules.validateVehicleInputs; 
import static app.Color.*;
import  java.util.Date;

public interface CollectionUtils 
{
	 static List<Vehicle> populateList() throws CustomException, ParseException {
			ArrayList<Vehicle> products = new ArrayList<>();
			//products.add(new Vehicle("100",  WHITE, 3200, "2019-01-01" ,product));
			Vehicle vehicle = validateVehicleInputs(123,"100",  "WHITE", 3200, "2019-01-01" ,products);
			products.add(vehicle);
			return products;
		}
	 
	 static Map<Integer,Vehicle> populateMapFromList(List<Vehicle> products)
		{
			Map<Integer,Vehicle> map=new HashMap<>();//up casting

			products.forEach(p -> map.put(p.getId(), p));
			return map;
				
		}


}
