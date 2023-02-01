package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String t, String u) {
		if (t.getBytes().length >= u.getBytes().length) return t;
		else return u;
		
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] test = {"hello", "how are you", "안녕하세요", "hajimemashite"};
		
		System.out.println(Arrays.stream(test).reduce("", (s1, s2) -> 
			{if (s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
			
		}));
		
		String st = Arrays.stream(test).reduce(new CompareString()).get();
		System.out.println(st);
	}

}
