package Assignment;
import java.util.Scanner;

class checkdouble {

	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		String num1, num2;
		boolean isNum1Double, isNum2Double;
		
		System.out.println("Enter num1 : ");
		isNum1Double = sc.hasNextDouble();//returns in boolean i.e true / false
		num1 = sc.next();
		
		
		if(isNum1Double == true) 
			System.out.println("--------------------\n"+num1+" is Double\n--------------------");
		else 
			System.out.println("--------------------\n"+num1+" is not Double\n--------------------\n");
		
		System.out.println("Enter num2 : ");
		isNum2Double = sc.hasNextDouble();
		num2 = sc.next();
		
		
		if(isNum2Double == true) 
			System.out.println("--------------------\n"+num2+" is Double\n--------------------\n");
		else
			System.out.println("--------------------\n"+num2+" is not Double\n--------------------\n");
		
		if(isNum1Double==true && isNum2Double==true)
			System.out.println("Average : "+((Double.parseDouble(num1)+Double.parseDouble(num2))/2));
		//parse extract necessary info and converts object of the calling class 1.parseInt() 2. Period parse (CharSequence text) 3. Level Parse etc.
		else
			System.out.println("Can not calculate avarage ");
		sc.close();
	}

}

