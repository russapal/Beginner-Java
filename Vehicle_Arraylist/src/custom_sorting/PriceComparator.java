package custom_sorting;
import java.util.Comparator;

import app.Vehicle;

public class PriceComparator implements Comparator<Vehicle> 
{
	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in compare : price");
		if (o1.getPrice() < o2.getPrice())
			return -1;
		if (o1.getPrice() == o2.getPrice())
			return 0;
		return 1;
	}
}
