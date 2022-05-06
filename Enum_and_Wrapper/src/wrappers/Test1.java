package wrappers;
import java.util.Date;

public class Test1 
{
	public static void main(String[] args) {
		// Integer i1=new Integer(100);//boxing
		// non deprecated boxing
		Integer i1 = Integer.valueOf(200);// boxing : prog
		Integer i2 = Integer.valueOf("-12345");// boxing
		int data = i1.intValue();// un boxing : explicitly done by prog
		i1 = 1234;// prim ---> wrapper done auto by javac : auto boxing(i1 =Integer.vaueOf(1234))
		data = i1;// wrapper --> prim , done auto by javac : auto un boxing
		String s = "12345";// no boxing / auto boxing / un boxing / auto un boxing
		// s++;
		data++;
		i1++;// auto un boxing Integer --> int , inc , auto boxing i1---> inced value
		System.out.println(i1);// 1235
		double d = 123.45f;// impl conversion : widening (float ---> double)
		// Double d1 = 123.45f;// RHS : float --> auto boxing ---> Float ---X---> Double
		// (can't perform up
		// casting , since Float IS NOT a Double)
		Double d1 = (double) 123.45f;// widening : p , boxing : comp (auto boxing)
		Number n1 = 123.456f;// float ---> Float (auto boxing) ---> Number (up casting)
		n1 = 234.45;// double --> Double --> Number
		n1 = 123456789l;// long --> Long --> Number
		Object o = 123.456f;// float ---> Float(auto boxing) --> Number(up casting) --> Object(up casting)
		o = true;// boolean --> Boolean --> Object
		o = 120345;
		o = 23.45F;
		o = "dfgsdf";// String ---> Object (up casting)
		o = new Date();
		o = 'a';// char --> Character --> Object
		// Is Java purely object oriented ???? NO (java supports prim types , does not
		// support all featues of OOP)
		// Can you refer to any data type(i.e prim as well as ref types) using Object
		// type of ref ??? YES

	}

}
