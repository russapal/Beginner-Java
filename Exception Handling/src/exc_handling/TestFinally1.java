package exc_handling;

public class TestFinally1 
{
     /*
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1"); //o/p line1
		try {
			testMe();// gets executed and outputs line 2 to 6 
			System.out.println("back in main");//O/p line 7
		} 
		catch (Exception e) {
			System.out.println("in main's catch-all  " + e);//doesn't appears in O/P
		} 
		finally {
			System.out.println("in main's finally");//O/p line 8
		}
		System.out.println("main over..");//o/p line 9

	}

	private static void testMe()   throws InterruptedException {
		try {
			System.out.println("in meth's try");//o/p line2
			String[] ss = { "aa", "bb" };// o/p line3
			Thread.sleep(1000);
			System.out.println(ss[0]);// prints nothing
			boolean flag = false;
			if (flag)
				return;
			System.out.println("end of try");//o/p line4
		} finally {
			System.out.println("in meth's finally");//o/p line 5
		}
		System.out.println("meth end");//o/p line 6
	}

}



