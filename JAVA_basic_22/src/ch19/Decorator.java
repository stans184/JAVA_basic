package ch19;

public abstract class Decorator extends Coffee{
	
	Coffee coffee;
	
	// class constructor
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}

}
