package String_Handling;

public class Test2 
{
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);// ref equality : false
		System.out.println(s1.equals(s2));// content equality : true
		String s3 = new String("Hello");
		// NOTE : String class has overridden inherited Object class's equals method for :
		// replacing ref equality by content equality
		System.out.println(s1.equals(s3));// content equality : false (case sensitive)
		System.out.println(s1.equalsIgnoreCase(s3)); // content equality : true (case insensitive)

	}

}
