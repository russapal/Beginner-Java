package test_static;

public class static_2 {
	
	private int i;
	private static int j;// def inited to 0
	// static init block
	
	static {
		System.out.println("in 1st static init block");
		System.out.println("j=" + j);// 0
		j = 100;
		show();

	}
	
	static {
		System.out.println("in 2nd static init block");
	}
	
	// non static init block
	{
		System.out.println("in instance init block");
	}

	public static void main(String[] args) {
		System.out.println("in main");
		
		// What can you access from main ? i , j , both or neither directly
		// System.out.println(i);
	     System.out.println(j);
		
	     // to access i : first create instance
		static_2 t1 = new static_2(12345);
		System.out.println(t1.i);
		static_2 t2 = new static_2(1234);
		System.out.println(t2.i);
		
		// using import static
//		System.out.println(pow(2, 3));//undefined here , gives exception/ error
//		System.out.println(sqrt(256));// undefined and  compilation error 

	}

	// ctor to init non-static data members(=instance vars=state of the obj)
	public static_2(int i) {
		System.out.println("in ctor");
		this.i = i;
	}

	// static method
	private static void show() {
		System.out.println("in show");
		// show2();
	}

	// non static method
	private void show2() {
		System.out.println("in show2");
		show();
	}


}
