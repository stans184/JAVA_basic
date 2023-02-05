package ch19;
// Decorator test
// 다양한 class 조합을 꾸며낼 수 있음
// Decorator class 의 구현이 제일 중요함
// 혼자 정의될 일은 없으니까 abstract
// 꾸미고 싶은 class 를 변수로 잘 받아야 함
public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee ethioCoffee = new EthiopiaAmericano();
		ethioCoffee.brewing();
		
		System.out.println();
		
		Coffee ethioLatte = new Latte(ethioCoffee);
		ethioLatte.brewing();
		
		System.out.println();
		
		Coffee ethioMocaLatte = new Moca(ethioLatte);
		ethioMocaLatte.brewing();
		
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
	}
}
