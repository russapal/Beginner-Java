package generic;

public class Tester {

	public static void main(String[] args)
	{
		Holder intHolder = new Holder(12345);
		int data = (Integer) intHolder.getref();
		System.out.println(data);
		
		Holder StringHolder = new Holder("Hello");
		String s = (String) StringHolder.getref();
		System.out.println(s);
		
		Holder<Integer> intHolder1 =new Holder<>(12345);
		int dataa = intHolder1.getref();
		System.out.println(dataa);
		
		Holder<String> StringsHolder = new Holder <>("At string ArrayList");
		String ss = StringsHolder.getref();
		System.out.println(ss);
		
		
	}
}
