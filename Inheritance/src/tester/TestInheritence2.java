package tester;
import inheritence.faculty;
import inheritence.person;
import inheritence.student;

public class TestInheritence2 
{
	public static void main(String[] args) 
	{
		//super cls ref, super cls obj , sub cls ref , sub class obj
		// create student instance : using direct referencing(ie. type of ref n type of the obj is the same)
		
		student student1=new student("Rama","Kher",2020,"PG-DBDA",123456,80);
		System.out.println(student1);//how it's implicitly calling student class  toString
		
		//indirect ref. to call student class toString by person object
		person p;
		p=student1;//up casting , why javac does up casting as auto conversion : IS -A i.e Student IS-A Person
		System.out.println(p);//p.toString() o/p : student's toString : run time poly.
		
		//create faculty instance : using direct ref.
		p=new faculty("Raj", "Singh", 10, "Java XML DBT ");//up casting
		System.out.println(p);//run time poly : faculty's toString
	}
}
