package ch02;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "everybody";
		
		// 람다식을 사용하지 않고 implement 받은 class 를 활용
		StringConcatImpl stringImpl = new StringConcatImpl();
		
		stringImpl.makeString(s1, s2);
		System.out.println("external class");
		
		// 람다식을 이용하여 함수를 구현 
		// interface 를 받은 class 를 생성하는 과정이 생략됨
		// 하지만 class 생성이 아예 안되는건 아님, main method 가 돌아가면서
		// anonymous class 를 생성
		// ** 자바에서는 instance 없이 method 가 호출 될 수 없음 **
		StringConcat concat = (s, v) -> {
			System.out.println(s + " + " + v);
		};
		
		concat.makeString(s1, s2);
		System.out.println("lambda method");
		
		// anonymous class
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " * " + s2);
			}
		};
		
		concat2.makeString(s1, s2);
		System.out.println("anonymous class");
	}

}
