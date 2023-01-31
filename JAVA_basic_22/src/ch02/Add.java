package ch02;

// 함수형 인터페이스
// 람다식을 쓰기 위해서 활용
// 단 하나의 method 만을 선언해야함

@FunctionalInterface
public interface Add {
	public int add(int x, int y);
}
