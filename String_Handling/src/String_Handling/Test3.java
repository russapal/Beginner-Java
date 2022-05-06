package String_Handling;

public class Test3 
{
	public static void main(String[] args) {
		String s1 = "hello";// literal or constant string : object --in a special area of the heap : const
							// string pool
		String s2 = new String(s1);// non literal string object
		String s3 = "HELLO";// literal string : new literal string("HELLO") will be added to SCP(string
							// const pool)
		String s4 = "hello";//literal , no dup literal string will be added to the pool(SCP)
		System.out.println("s1==s2" + (s1 == s2));// f
		System.out.println("s1.equals(s2)" + s1.equals(s2));// t
		System.out.println("s1==s3" + (s1 == s3));// f
		System.out.println("s1.equals(s3)" + s1.equals(s3));// f
		System.out.println("s1==s4" + (s1 == s4));// t
		System.out.println("s1.equals(s4)" + s1.equals(s4));// t

	}


}
