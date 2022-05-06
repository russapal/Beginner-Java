package custom_sorting;
import java.util.Comparator;
import practice.Emp;

public class HiringDate_Sorting implements Comparator<Emp>
{
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getHiringDate().compareTo(o2.getHiringDate());
	}

}
