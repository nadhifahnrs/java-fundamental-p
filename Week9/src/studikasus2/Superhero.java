package studikasus2;

import java.util.*;

public abstract class Superhero implements Comparable<Superhero>{
	private int powerLevel;
	private String Name;
	private List<Power> powerList;
	
	public Superhero(String Name, int powerLevel) {
		this.Name = Name;
		this.powerLevel = powerLevel;
		this.powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return Name;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public abstract void identity();
	
	public void showPower() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
	}
	
	@Override
	//default compareTo jika menggunakan Comparable
	public int compareTo(Superhero o) {
		if(this.powerLevel > o.powerLevel) {
			return 1;
		}
		else if(this.powerLevel < o.powerLevel) {
			return -1;
		}
		else 
			return 0;
	}
}
