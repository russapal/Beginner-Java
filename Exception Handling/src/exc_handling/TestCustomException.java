package exc_handling;
	import java.util.Scanner;
	import static utils.SpeedUtils.validateSpeed;

	import utils.SpeedUtils;

	public class TestCustomException {

		public static void main(String[] args) {
			try(Scanner sc=new Scanner(System.in))
			{
				System.out.println("Enter current speed");
				//invoke SpeedUtils' method to check the speed
				validateSpeed(sc.nextInt()); // a method in SpeedUtils class is called checks and provides the O/p similarly
				System.out.println("after method call");
			} catch (Exception e) {
				e.printStackTrace();//nm , mesg location when throw conditions are met in SpeedUtilsclass it O/p/throws an exception
				//in red colour
			}
			System.out.println("main continues....");

		}

	}

