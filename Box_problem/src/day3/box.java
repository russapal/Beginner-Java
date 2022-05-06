package day3;

public class box 
{
	// tight encapsulation
		private double width ,height, depth;
		
		box(double w , double height, double d) //parameterized constructor
		{
			// double w etc are called method variables
			
			this.height = height; // Here this keyword is mandatory as both instance variable (L.H.S) and method variable (R.h.s) are same
			this.depth =d;
			this.width= w;		
		}
		
		box (double side)
		{
			this (side,side ,side); //constructor chaining: 1 constructor invoking another constructor
			System.out.println("Constructor chaining is called"); // remember here constructor chaining has to be first line orelse you will get compilation error
		}
		
		box()
		{
			this(-1); //overloaded constructor to initialize box with value of -1
			System.out.println("overloading constructor called");
		}
		
		
		
		
		String getBoxDims() //method/function created
		{
			return "Box Dims "+this.width+" " +this.depth+" " +this.height;
			/*to print the values you can call it using System.out.println ( function name());
			 * if you want to call it in main() then the syntax will objectname.function name();
			 */
		}
		
		double getVolume()
		{
			return width*depth*height;
		}
		
		boolean isEqual(box anotherbox) //for b2 object copy reference
		{
			return width==anotherbox.width && depth == anotherbox.depth &&height==anotherbox.height;
			
		}

}
