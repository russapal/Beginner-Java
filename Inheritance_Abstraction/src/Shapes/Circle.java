package Shapes;
import static java.lang.Math.PI;

public class Circle extends Bounded_Shapes
{
	//state (data)
		private double radius;
		public Circle(int x,int y,double radius) {
			super(x,y);
			this.radius=radius;
		}
		//implement inherited abstract functionality
		@Override
		public double area()
		{
			return PI*radius*radius;
		}
		//override toString for replacing B.S 's toString  by complete  circle details
		@Override
		public String toString()
		{
			return "Circle "+super.toString()+" radius="+radius;
		}

	

}
