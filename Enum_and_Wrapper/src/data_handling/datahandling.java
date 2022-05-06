package data_handling;
import java.util.Date;

public class datahandling 
{
	public static void main(String[] args) {
		//create Date class instance to represent curnt date
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date(5000);
		System.out.println(d2);
		System.out.println("d1 before d2 "+d1.before(d2));//f
		System.out.println(d1.after(d2));//t
		System.out.println("d1 compareTo d2 "+d1.compareTo(d2));// +1
	}
}

