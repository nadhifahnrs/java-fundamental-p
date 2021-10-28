package exercise2;

public class MainTest {

	public static void main(String[] args) {
		
	// Menampilkan output dengan memanggil constructor 1
	Shape shape1 = new Shape();
	System.out.println("shape1 = " + shape1.toString());
	
	// Menampilkan output dengan memanggil constructor 2
	Shape shape2 = new Shape("black",false);
	System.out.println("shape2 = " + shape2.toString());
	
	System.out.println();
	
	Circle circle1 = new Circle();
	System.out.println("circle1 = " + circle1.toString());
	
	Circle circle2 = new Circle(7);
	System.out.println("circle2 = " + circle2.toString());
	
	Circle circle3 = new Circle(11,"purple",false);
	System.out.println("circle3 = " + circle3.toString());
	
	System.out.println("luas lingkaran= " + circle1.getArea());
	System.out.println("keliling lingkaran= " + circle1.getPerimeter());
	
	System.out.println();
	
	Rectangle rec1 = new Rectangle();
	System.out.println("rectangle1 = " + rec1.toString());
	
	Rectangle rec2 = new Rectangle(8,9);
	System.out.println("rectangle2 = " + rec2.toString());
	
	Rectangle rec3 = new Rectangle(10,12,"white",true);
	System.out.println("rectangle = " + rec3.toString());
	
	System.out.println("luas persegi panjang= " + rec1.getArea());
	System.out.println("keliling persegi panjang= " + rec1.getPerimeter());
	
	System.out.println();
	
	Square square1 = new Square();
	System.out.println("square1 = " + square1.toString());
	System.out.println("luas persegi= " + square1.getArea());
	System.out.println("keliling persegi= " + square1.getPerimeter());
	}

}
