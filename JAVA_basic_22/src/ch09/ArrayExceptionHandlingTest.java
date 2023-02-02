package ch09;

public class ArrayExceptionHandlingTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
			// 그냥 exception 으로 해도 되는데, 구체적인 항목을 정해주면 더 빠름?
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("check index range");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		// try catch를 이용해서 exception 이 발생한 이후에도 프로그램을 계속 실행시킬 수 있다
		System.out.println("Done");
	}

}
