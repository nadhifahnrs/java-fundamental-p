package studikasus2;

// Pahlawan yang bisa MENEMBAKKAN LASER dan KEKUATAN SUPER 

public class ManRay extends Superhero{
	public ManRay(String Name, int powerLevel) {
		super(Name, powerLevel);
		Power laser = new LaserEye();
		Power strength = new Strength();
		addPower(laser);
		addPower(strength);
	}
	
	// implement the inherited abstract method Superhero.identity
	@Override
	public void identity() {
		System.out.println("It's " + getName() + ", the FlyingDutchMan!" + 
				" It has the power level of " + getPowerLevel());
		System.out.println(".....HEED ME.....");
	}
}
