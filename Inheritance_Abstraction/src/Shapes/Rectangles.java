package Shapes;

public class Rectangles extends Bounded_Shapes
{
	
	private double width,height;
	public Rectangles(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle "+super.toString()+" [width=" + width + ", height=" + height + "]";
	}

}
