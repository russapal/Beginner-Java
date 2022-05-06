package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.StudentDetails;

import static app.Course.*;
import static java.time.LocalDate.*;

public interface CollectionUtils 
{
	 static List<StudentDetails> populateList() {
			ArrayList<StudentDetails> students = new ArrayList<>();
			students.add(new StudentDetails( "maria", CS, 5));
			students.add(new StudentDetails( "brian", IT, 5));
			students.add(new StudentDetails( "sunny", EC, 5));
			students.add(new StudentDetails( "ria", EE, 5));
			students.add(new StudentDetails( "oindrilla", EI,5));
			students.add(new StudentDetails( "whey", CS, 7));
			students.add(new StudentDetails( "mary", IT, 5));
			students.add(new StudentDetails( "arpi", EC,7));
			students.add(new StudentDetails( "bary", EI, 6));
			return students;
		}
		//add a static method to copy list of products in to the map : HashMap
		static Map<Integer,StudentDetails> populateMapFromList(List<StudentDetails> students)
		{
			Map<Integer,StudentDetails> map=new HashMap<>();//up casting
			//imperative style of prog
//			for(Product p : products)
//				map.put(p.getId(), p);
			//func style of prog
			students.forEach(p -> map.put(p.getAge(), p));
			return map;
				
		}

}
