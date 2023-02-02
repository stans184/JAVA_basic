package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandlingTest {

	public static void main(String[] args) {
		
		// 예전에는 file 등을 열면 꼭 닫기 위해서 아래와 같이 exception 을 지저분하게 했어야 하나,
		// 지금은 fileInputStream 등은 AutoClosable interface 를 구현하기 때문에 
		// 구동이 다 끝나면 자동으로 close() 된다
			
			FileInputStream fi = null;
		try {
			fi = new FileInputStream("a.txt");			// 이렇게 적어놓으면 project location 에서 file을 찾는다
			System.out.println("READ");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("File not found");
//			e.printStackTrace();
			// try 로 가든, catch 로 가든 finally는 항상 불린다
		}finally {
			// file 을 닫을거면, 열려 있을 때 동작시켜야 함
			if (fi != null) {
				try {
					fi.close();
					System.out.println("File Closed");
				} catch (IOException e) {
//				e.printStackTrace();
				}
			}
			System.out.println("Finally processed");
		}
		// file 이 없어서 exception 이 발생하기는 하나, try catch 로 인해서 program의 마지막까지 실행된다
		System.out.println("PROGRAM END");
		
		try (FileInputStream fi2 = new FileInputStream("b.txt")){
			System.out.println("READ");
		} catch (Exception e) {

		}
		System.out.println("PROGRAM END2");
		
		
	}

}
