package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArraysListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		
		sList.add("Thomas");
		sList.add("Jack");
		sList.add("Kane");
		sList.add("Paul");
		
		Stream<String> st = sList.stream();
		st.forEach(s -> System.out.println(s));
		// 한번 사용된 stream 은 재사용 할 수 없음
		sList.stream().sorted().forEach(s -> System.out.println(s));
		// sorted 는 객체 자체를 변환시키진 않음, 재출력한 결과를 보면 다시 원래 넣은 순서대로 나옴
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s));
	}

}
