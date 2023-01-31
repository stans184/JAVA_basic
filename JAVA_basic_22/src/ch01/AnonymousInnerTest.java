package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 250;
	
	Runnable getRunnable(int i) {
		
		int num = 10;
		
		class MyRunnable implements Runnable{
			
			int localNum = 50;

			@Override
			public void run() {
				
				// method의 호출이 끝나면 stack에 불려왔던 지역 변수도 사라지게 됨 
//				i = 50;
//				num = 20;
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
		}
		
		return new MyRunnable();
		
//		Anonymouse inner class
//		return new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable Called");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {

		// getrunnable method 를 통해 return 값을 준 이후에는
		// stack 에 저장했던 지역변수가 다 사라짐
		// 따라서 method 의 지역변수인 i, num 은 run method 에서 호출할 수 없
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(1000);

		runner.run();
		
		System.out.println();
		
		out.runnable.run();
		
	}

}
