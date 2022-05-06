package Tester;
import Shapes.Bounded_Shapes;
import Shapes.Circle;
import Shapes.Rectangles;

	/*
	 * eg : In a Tester 
	Create bounded shapes using dyn init of array.
	{c1,r1,c2,r2}
	Display it's info n area : for-each
	 */
	public class TestAbstraction {

		public static void main(String[] args) {
			Bounded_Shapes shape1;
			//Create bounded shapes using dyn init of array.
			Bounded_Shapes[] shapes = { new Circle(10, 20, 10.5), new Rectangles(20, 40, 5, 7), new Circle(20, 40, 15.5),
					new Rectangles(30, 80, 15, 17) };// how many objs in heap : 1(array of refs of the type BoundedShape) + 4
			//Display it's info n area : for-each
			for(Bounded_Shapes s : shapes) //s=shapes[0]....s=shapes[shapes.length-1]
				System.out.println(s+" Area "+s.area());

		}

	}


