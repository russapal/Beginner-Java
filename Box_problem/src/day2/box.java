package day2;

 class box {
	// tight encapsulation
	private double width ,height, depth;
	
	box(double w , double height, double d) //parameterized constructor
	{
		// double w etc are called method variables
		
		this.height = height; // Here this keyword is mandatory as both instance variable (L.H.S) and method variable (R.h.s) are same
		this.depth =d;
		this.width= w;		
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

}
