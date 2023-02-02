package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj testObj = new AutoCloseObj();
		
		// try catch 에 변수를 넣어주면 autoclose 를 진행
		try (testObj){
			// 강제로 exception 을 발생시킴
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception!");
		}
		
		System.out.println("Program End");
	}

}
