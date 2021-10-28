package exercise2;

public class Shape {
	private String color;
	private boolean filled;
	
	/* Constructor 1 without parameter*/
	public Shape() {
		color = "green";
		filled = true;
	}
	
	/* Constructor 2 with parameter*/
	public Shape(String col, boolean fill) {
		color = col;
		filled = fill;
	}
	
	/* Getter for Shape */
	public String getColor() {
		return color;
	}
	
	/* Setter for Shape */
	public void setColor(String color) {
		this.color = color;
	}
	
	/* Getter for filled */
	public boolean isFilled() {
		return filled;
	}
	
	/* Setter for Filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if(isFilled()) {
			return "A Shape wih color " + color + " and filled";
		}
		else {
			return "A Shape wih color " + color + " and Not filled";
		}
	}
}
