package ch12;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> testSet = new HashSet<String>();
		
		testSet.add(new String("Kane"));
		testSet.add(new String("John"));
		testSet.add(new String("Paul"));
		testSet.add(new String("Jane"));
		// set 은 중복을 허용하지 않는다, input 에 같은 값이 들어갔지만 출력은 중복값 삭제함 
		testSet.add(new String("John"));

		System.out.println(testSet);
	}
}
