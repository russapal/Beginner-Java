package tester;
import inheritence.faculty;
import inheritence.person;
import inheritence.student;

public class TestInheritence4 {
	public static void main(String[] args) {
		person p = new student("Rama", "Kher", 2020, "PG-DBDA", 123456, 80);// up casting
		System.out.println(p);// run time poly.--> printing student details
		
		((student) p).study();// prog : explicit down casting to satisfy : javac
		
		//((faculty)p).teach();//ClassCastException error: runtime error : Student can't be cast into Faculty
		
		p = new faculty("Raj", "Singh", 10, "Java XML DBT ");// up casting
		System.out.println(p);// run time poly : faculty's toString
		// p.teach();// why javac err : javac resolves by type of ref --i.e it chk for
		// teach() method
		// in Person class --does not find it --so the err
		((faculty) p).teach();// prog must perform explicit downcasting since Every Person IS NOT a Faculty
		((student) p).study();// no javac err , run time err : java.lang.ClasscastExc --Faculty can not be
								// cast into Student


}
}
