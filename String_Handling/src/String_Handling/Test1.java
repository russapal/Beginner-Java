package String_Handling;

public class Test1 
{
	public static void main(String[] args) {
		 String s=new String("hello");
		System.out.println(s);// hello
		s.concat("hi");
		System.out.println(s);//hello
		s=s.concat("12345");
		System.out.println(s);//hello12345
		String s1=s.toUpperCase();
		System.out.println(s);//lower 
		System.out.println(s1);//upper
	}

}
