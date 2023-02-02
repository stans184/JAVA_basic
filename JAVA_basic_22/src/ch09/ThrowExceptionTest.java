package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExceptionTest {
	
	// 하기와 같이 method 에서 exception 을 handling 하지 않고 throw 하면
	// method를 사용하는 쪽에서 exception 을 handling 해줘야 함
	// 상황에 따라 어디서 처리하는게 좋은지는 달라짐
	// 예를 들어, exception 이 발생하는 쪽에서 처리하게 되면 logging 확보에 보다 용이
	public Class loadClass (String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		FileInputStream fi = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		
		return c;
	}
	// main method 에서 exception 을 throw 하게 되면, program abort 발생됨
	public static void main(String[] args) {
		
		ThrowExceptionTest test = new ThrowExceptionTest();
		
		// method 를 선언할 때 throw 했던 2 개의 exception 을 어떻게 처리할지 핸들링해야 함
		// method 에 구현된 순서대로 진행하다가 exception 이 발생하면 해당 point 를 보여줌
		// 파일이 아예 없다면, filenotfound 부터 발생되어 해당 exception 만 출력되고
		// 파일을 만들어주면 classnotfound가 발생됨
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
			// 내가 파악한 exception 말고, 다른 종류의 exception 이 발생했을 경우 하기로 빠진다
			// 근데 default exception 을 맨위에다가 쓰면 전부다 그리 빠져버림
		} catch (Exception e) {
			System.out.println("Exception Occured which i don't know");
		}
		
		// 여러 exception 이 발생했을 때, 각각 처리하지 않고 한군데에서 처리하고 싶으면 try multi catch
		try {
			test.loadClass("a.txt", "java");
		} catch (ClassNotFoundException | FileNotFoundException e) {
			// 그때그때 발생하는 exception 에 따라서 알아서 e 의 종류가 바뀜
			System.out.println(e);
		}
		
		// try catch 를 사용하면 exception 이 발생해도 프로그램이 비정상 종료된 것이 아님
		System.out.println("Progrma Normally End");
	}

}
