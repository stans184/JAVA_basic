package ch19;

public class Latte extends Decorator{
	
	// decoretor class 가 상위 class 인데, default constructor 가 없으므로, 여기서 constructor 를 추가해야 함
	
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}
}
