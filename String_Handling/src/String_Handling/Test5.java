package String_Handling;

public class Test5 
{
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("hello");// how many objs are created ? 2
		System.out.println("contents = "+sb1);// hello
		System.out.println("length "+sb1.length()+" capa "+sb1.capacity());//5 21
		StringBuilder sb2=sb1.append(123.45);
		System.out.println(sb1);//hello123.45
		System.out.println(sb2);//hello123.45
		System.out.println(sb1==sb2);//true
		StringBuilder sb3=sb1.deleteCharAt(0);//ello123.45
		System.out.println(sb1);//ello123.45
		System.out.println(sb3);//ello123.45
		System.out.println(sb1==sb3);//t
		sb1.insert(0, 234.567F);
		System.out.println(sb1);//234.567ello123.45
		StringBuilder sb4=new StringBuilder("hello");
		System.out.println(sb1==sb4);//f
		System.out.println(sb1.equals(sb4));//f
		

	}

}
