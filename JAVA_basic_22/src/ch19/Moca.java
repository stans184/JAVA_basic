package ch19;

public class Moca extends Decorator{

	// class constructor
	public Moca(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.println(" Adding Mocha");
	}

}
