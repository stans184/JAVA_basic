package ch02;

public class AddTest {

	public static void main(String[] args) {

		// 람다 함수 선언
		// 미리 method를 선언해놓은 interface를 instance로 받고,
		// 받은 instance 에서 method 를 구현
		// 그러면 interface 이름을 add 말고, '사칙연산' 같은거로 하면 좋겠네 
		// 가장 간단하게 하면
		// (x,y) -> x+y;
		// str -> str.length;
		
		Add addTest = (int x, int y) -> {return x+y;};
		
		System.out.println(addTest.add(9, 4));
		
		Add maxTest1 = (int x, int y) -> {
			if (x > y) return x;
			else return y;
		};
		
		// 가장 간단한 표현 
		Add maxTest2 = (x,y) -> x > y ? x : y;
		
		
		System.out.println(maxTest1.add(8, 4));
		
	}
}
