package exc_handling;

public class TestUncheckedExc 
{
	public static void main(String[] args) {
		try {
			System.out.println("main strted ...");
			int a = 100 /10;
			System.out.println("result " + a);
			String[] names = { "Riya", "Sri" };
			System.out.println(names[20]);//ArrayIndexOutOfBoundsExc
			String s = "Hello";
			System.out.println("char at 0th index " + s.charAt(0));
			System.out.println("Parsed double value " + Double.parseDouble("abc1234"));
			System.out.println("end of try");
		}
//		 catch (ArithmeticException e) {
//			System.out.println("1");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("2");
//		}
		catch (Exception e) {
			System.out.println("in catch-all");
	//		System.out.println(e.getMessage()); only error mesg
	//		System.out.println(e);//e.toString name of exc + err mesg
			e.printStackTrace();//name of exc + err mesg + location(stack trace)
		}		
		System.out.println("main cntd...");

	}

}
