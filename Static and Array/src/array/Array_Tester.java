package array;
import java.util.Scanner;

public class Array_Tester{

		public static void main(String[] args) {
			// create scanner class instance wrapping stdin
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array to hold double values"); // 5
			
			double[] data;   // since it's a method local var , type : array ref var , mem allocated on stack
							// : 4/8/16 i.e as per JVM spec.
			
			
			data = new double[sc.nextInt()];// [D get loaded in method area , array object is created in the heap.
			System.out.println("Name of the class loaded " + data.getClass()); // [D
			System.out.println("length of the array " + data.length);
			
			// display array contents : for loop
			for (int i = 0; i < data.length; i++)
				System.out.print(data[i] + " ");
			/*
			 * Accept data from User(scanner) & store it in the array. Display array data
			 * using for loop.
			 * 
			 */
			
			
			System.out.println();
			for(int i=0;i<data.length;i++)
			{
				System.out.println("Enter array data");
				data[i]=sc.nextDouble();
			}
			
			
			// display array contents : for loop
					for (int i = 0; i < data.length; i++)
						System.out.print(data[i] + " ");
					System.out.println();
					System.out.println("Array contents using for-each loop");
					//display array contents using for-each (enhanced for loop)
					for(double d : data) //d=data[0] , d=data[1]....d=data[data.length-1]
						System.out.print(d+" ");
					//{10,20,30,40}
					
					System.out.println("Understanding for-each");
					for(double a : data) //a=data[0],....
					{
						a *= 2; //copy of the arr elem is doubled
						System.out.print(a);
					}
					
					//display array contents using for-each (enhanced for loop)
					for(double a : data) //d=data[0] , d=data[1]....d=data[data.length-1]
						System.out.print(a+" ");//original array data
				

					sc.close();

		}

	}


