package Shapes;

public abstract class Bounded_Shapes 
{
	//state : non static data members (allocated in heap) : instance vars
		private int x,y;

		public Bounded_Shapes(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		//add a method to calc area of any bounded shape
		//abstract method declaration
		
		public abstract double area();
		//override toString , to replace hashcode version by actual shape details
		@Override //this is to inform javac , following is the overriding form of the method
		public String toString()
		{
			return "x="+x+" y="+y;
		}

}
