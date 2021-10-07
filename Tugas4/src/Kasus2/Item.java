package Kasus2;

public class Item {
	private String name;
	
	private Item() {
		name = "Ipin";
}
public Item(String name) {
	// solusi //
	// pemanggilan constructor private untuk constructor public dengan class yang sama
	this();		
	System.out.println(this.name);
	}
}
