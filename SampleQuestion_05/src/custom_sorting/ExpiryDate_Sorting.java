package custom_sorting;
import java.util.Comparator;
import practice.Product;

public class ExpiryDate_Sorting implements Comparator<Product>
{
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getexpirydate().compareTo(o2.getexpirydate());
	}

}
