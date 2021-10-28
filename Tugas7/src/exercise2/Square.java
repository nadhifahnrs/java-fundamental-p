package exercise2;

public class Square extends Rectangle{
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side,side); // call superclass Rectangle(double,double)
	}
	
	public Square(double side, String col, boolean fill) {
		super(side, side, col, fill);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side = " + getSide() + 
				", which is a subclass of " + super.toString();
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
}
