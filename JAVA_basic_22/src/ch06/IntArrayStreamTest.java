package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// arrays 의 stream 을 이용하면, foreach 를 이용
		// foreach 는 하나씩 꺼내는 것
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.print(n + " "));
		// 이렇게 한번 연산이 수행되고 나면, is는 소모됨, 따라서 is 의 재사용 불가
		// stream has already been operated upon or closed 에러 뜸 
//		int total = is.sum();
//		System.out.println(total);
		
		System.out.println();
		
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		
	}

}
