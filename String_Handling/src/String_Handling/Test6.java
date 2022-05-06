package String_Handling;

public class Test6 {
	public static void main(String[] args) {
		StringBuilder sb0 = new StringBuilder();
		System.out.println("length " + sb0.length() + " capa " + sb0.capacity());// 0 16
		StringBuilder sb1 = new StringBuilder("hello");// how many objs are created ? 2
		// 1 literal string added to SCP : "hello" , sb1 ---> new StringBuilder obj : 5
		// 21 , contents : hello
		System.out.println("contents = " + sb1);// hello
		System.out.println("length " + sb1.length() + " capa " + sb1.capacity());// 5 21
		StringBuilder sb2 = sb1.append(123.45);
		System.out.println(sb1);// hello123.45
		System.out.println(sb2);// hello123.45
		System.out.println(sb1 == sb2);// true
		StringBuilder sb3 = sb1.deleteCharAt(0);// ello123.45
		System.out.println(sb1);// ello123.45
		System.out.println(sb3);// ello123.45
		System.out.println(sb1 == sb3);// t
		sb1.insert(0, 234.567F);
		// Mgr mgr1=new Mgr(......);sb1.append(mgr1); // no javac err , mgr1.toString()
		// will be appended to sb1
		System.out.println(sb1);// 234.567ello123.45
		StringBuilder sb4 = new StringBuilder("hello");// new SB with contents : hello
		System.out.println(sb1 == sb4);// f
		System.out.println(sb1.equals(sb4));// f
		StringBuilder sb5 = new StringBuilder("hello");
		System.out.println(sb4 == sb5); // f : ref equality
		System.out.println(sb4.equals(sb5));// f : calling Object's equals : ref equality
		// Summary : String class HAS OVERRIDDEN equals method inherited from OBject
		// class
		// i.e String's equals method works on content equality
		// StringBuilder class HAS NOT OVERRIDDEN equals method inherited from OBject
		// class
		// i.e StringBuilder's equals method works on ref equality
		String s1 = "hi";
		String s2 = new String(s1);
		System.out.println(s1 == s2);// f
		System.out.println(s1.equals(s2));// t

	}

}
