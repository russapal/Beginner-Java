package custom_sorting;
import java.util.Comparator;

import app.Vehicle;

public class DateComparator implements Comparator<Vehicle> 
{
	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in vehicle's compare : date");
		return o1.getManufactureDate().compareTo(o2.getManufactureDate());
	}
	

}
