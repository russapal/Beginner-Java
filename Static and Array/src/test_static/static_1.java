package test_static;
import static java.lang.Math.*;
import static java.lang.System.out;

public class static_1 
{
	private int i;
	private static int j;// def initiated to 0

	public static void main(String[] args) {
		// What can you access from main ? i , j , both or neither directly
		// System.out.println(i);
		
		out.println(j);//o/p value = 0
		
		// to access i : first create instance
		static_1 t1 = new static_1(12345);
		out.println(t1.i);//o/p value of integer i
		
		//using import static
		System.out.println(pow(2, 3));
		System.out.println(sqrt(256));

	}

	// ctor to init non-static data members(=instance vars=state of the obj)
	public static_1(int i) {
		this.i = i;
	}

	// static method
	private static void show() {
		System.out.println("in show"); //no o/p
	//	show2();
	}

	// non static method
	private void show2() {
		System.out.println("in show2"); //no o/p
		show();
	}


}
