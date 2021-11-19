package studikasus2;

// Pahlawan yang bisa TERBANG dan MENEMBAKKAN LASER

public class FlyingDutchMan extends Superhero{
	public FlyingDutchMan(String Name, int powerLevel) {
		super(Name, powerLevel);
		Power flying = new Flying();
		Power laser = new LaserEye();
		addPower(flying);
		addPower(laser);
	}
	
	// implement the inherited abstract method Superhero.identity
	@Override
	public void identity() {
		System.out.println("It's " + getName() + ", the FlyingDutchMan!" + 
				" It has the power level of " + getPowerLevel());
		System.out.println(".....HEED ME.....");
	}
}
