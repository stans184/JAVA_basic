package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 25;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int iNum = 55;
		
		static int sInNum = 500;
		// instance inner class 안에서는 정적 변수 사용이 불가능하다고 하는데,
		// 나는 오류가 안남 ?
		
		void inTest(){
			System.out.println("OuterClass Num is " + num);
			System.out.println("OuterClass static Num is " + sNum);
			System.out.println("InnerClass Num is " + iNum);
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	// 정적 내부 클래스 
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 250;
		
		void inTest(){
			
			// static class 이므로, outerclass가 생성되기 전에 instaticclass가 생길수 있음
			// outerclass의 num이 그래서 오류가 나는 중 
//			System.out.println("OuterClass Num is " + num);
			System.out.println("OuterClass static Num is " + sNum);
			System.out.println("InnerClass Num is " + iNum);
			System.out.println("InnerClass static Num is " + sInNum);
		}
		
		static void sInTest() {
			// inner class 의 변수는 여기서 오류가 남
			// static class 의 static method 는 class 호출이 없어도 불릴 수 있으므
			System.out.println("OuterClass static Num is " + sNum);
//			System.out.println("InnerClass Num is " + iNum);
			System.out.println("InnerClass static Num is " + sInNum);
			
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

//		OutClass outClass = new OutClass();
//		outClass.usingClass();
//		
//		System.out.println();
//		
//		// outclass의 inclass 가 private 이 아니라면 직접 생성도 가능 
//		// 주로 이렇게 사용하지 않는다 
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		inStaticClass.inTest();
		
		System.out.println();
		
		// static class > static method 바로 호출 가능 
		OutClass.InStaticClass.sInTest();
		
	}

}
