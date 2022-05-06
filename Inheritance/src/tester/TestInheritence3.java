package tester;
import inheritence.faculty;
import inheritence.person;
import inheritence.student;

public class TestInheritence3 {

	public static void main(String[] args) {
		person p = new student("Rama", "Kher", 2020, "PG-DBDA", 123456, 80);// up casting
		System.out.println(p);// run time poly.--> printing student details
	
		//	p.study();//why javac err : javac resolves by type of ref --i.e it chk for
		// study() method in Person class
		//soln downcasting 
		
		((student)p).study();//((student class) parent obj).function in student class();
		
		p = new faculty("Raj", "Singh", 10, "Java XML DBT ");// up casting
		
		System.out.println(p);// run time poly : faculty's toString
		// p.teach();// why javac err : javac resolves by type of ref --i.e it chk for
		// teach() method
		// in Person class --does not find it --so the err
		((faculty) p).teach();// prog must perform explicit downcasting since Every Person IS NOT a Faculty

	}

}
