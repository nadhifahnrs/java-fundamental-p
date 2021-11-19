package studikasus2;

// Pahlawan yang bisa TERBANG dan MEMILIKI KEKUATAN SUPER

public class DirtyBubble extends Superhero{
	public DirtyBubble(String Name, int powerLevel) {
		super(Name, powerLevel);
		Power flying = new Flying();
		Power strength = new Strength();
		addPower(flying);
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
