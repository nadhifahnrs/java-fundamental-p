package exercise2;

public class Circle extends Shape{
	private double radius;
	
	/* Constructor 1 without parameter */
	public Circle() {
		radius = 1.0;
	}
	
	/* Constructor 2 with 1 parameter tanpa color dan filled*/
	public Circle(double r) {
		this.radius = r;
	}
	
	/* Constructor 3 with 3 parameter */
	public Circle(double r, String col, boolean fill) {
		this.radius = r;
		super.setColor(col);
		super.setFilled(fill);
	}
	
	/* Getter for radius */
	public double getRadius() {
		return radius;
	}
	
	/* Setter for radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* method getArea */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/* method getParameter */
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
		
	}
}
