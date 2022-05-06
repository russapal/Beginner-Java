package tester;
import inheritence.faculty;
import inheritence.student;

public class TestInheritence1 {
	
	public static void main(String[] args)
	{
		// create student instance
		student student1=new student("Rama","Kher",2020,"PG-DBDA",123456,80);
		System.out.println(student1);// it's implicitly calling student class toString and prints all the details using person and student class
		
		//create faculty instance
		faculty faculty1=new faculty("Raj", "Singh", 10, "Java XML DBT ");
		System.out.println(faculty1);//it prints faculty class to string data
	}

}
