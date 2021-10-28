package exercise2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	/* Constructor 1 without parameter */
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	/* Constructor 2 with 2 parameter tanpa color dan filled*/
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}
	
	/* Constructor 3 with 4 parameter */
	public Rectangle(double w, double l, String col, boolean fill) {
		this.width = w;
		this.length = l;
		super.setColor(col);
		super.setFilled(fill);
	}
	
	/* Getter and setter for width */
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	/* Getter and setter for length */
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	/* method getArea */
	public double getArea() {
		return width*length;
	}
	
	/* method getParameter */
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "A Rectangle with width = " + width + " and length = " + length
				+ ", which is a subclass of " + super.toString();
		
	}

}
