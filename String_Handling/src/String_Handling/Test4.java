package String_Handling;
import java.util.Arrays;

public class Test4 
{
	public static void main(String[] args) {
		//String class API works in 100 % SAME manner irrespective of whether 
		//it's literal or non literal string
		String s1="testing string with different test cases is interesting";
		System.out.println("length "+s1.length());//no of chars
		//searching methods
		System.out.println("s1 contains 'with' "+s1.contains("with"));//true
		System.out.println("first occurrence of 'test' "+s1.indexOf("test"));//0
		System.out.println("last occurrence of 'test' "+s1.lastIndexOf("test"));
		String[] names= {"Anish","Amish","Riya","Amruta","Raj"};
		System.out.println("comparison of strings "+(names[0].compareTo(names[1])));// > 0
		System.out.println("comparison of strings "+(names[0].compareTo(names[2])));// < 0
		System.out.println("comparison of strings "+(names[2].compareTo(names[4])));// > 0
		System.out.println("substring "+s1.substring(0, 5));// testi
		System.out.println(Arrays.toString(s1.split(" ")));//["testing","string"....]
		System.out.println("last char "+s1.charAt(s1.length()-1));
		

	}

}
