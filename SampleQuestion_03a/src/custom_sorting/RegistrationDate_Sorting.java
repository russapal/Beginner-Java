package custom_sorting;
import java.util.Comparator;
import practice.StudentDetails;

public class RegistrationDate_Sorting implements Comparator<StudentDetails>
{
	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.getRegistrationDate().compareTo(o2.getRegistrationDate());
	}

}
