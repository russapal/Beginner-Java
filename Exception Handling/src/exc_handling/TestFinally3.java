package exc_handling;
import java.util.Scanner;

public class TestFinally3 
{	/**
		 * @param args
		 */
		public static void main(String[] args) {
			System.out.println("1"); //O/P line1
			try {
				testMe(); //gets executed next and o/p line 2 to 4
				System.out.println("back in main"); //o/p line5
			} catch (Exception e) {
				System.out.println("in main's catch-all  " + e); //doesn't gets print
			} finally {
				System.out.println("in main's finally");//o/p line 6
			}
			System.out.println("main over..");//o/p line 7

		}

		private static void testMe()   throws InterruptedException {
			try {
				System.out.println("in meth's try"); //o/p line 2
				String[] ss = { "aa", "bb" };//o/p line3
				Thread.sleep(1000);//sleeps down the process
				System.out.println(ss[1]);
				boolean flag = true;
				if (flag)
					return;
				System.out.println("end of try");//doesn't gets print
			} finally {
				System.out.println("in meth's finally");// o/p line4 
			}
			System.out.println("meth end");//doesn't gets print
		}


	}

