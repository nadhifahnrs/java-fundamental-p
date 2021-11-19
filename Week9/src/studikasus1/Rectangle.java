package studikasus1;

/** Painting Shape **/
// subclass dari Shape 

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		super("Rectangle");
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return width*length;
	}
	
	public String toString() {
		return super.toString() + "of width " + width + "and length " + length;
	}
}
