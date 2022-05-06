package custom_sorting;
import java.util.Comparator;
import practice.VolunteerDetails;

public class RegistrationDate_Sorting implements Comparator<VolunteerDetails>
{
	@Override
	public int compare(VolunteerDetails o1, VolunteerDetails o2) {
		return o1.getDob().compareTo(o2.getDob());
	}

}
