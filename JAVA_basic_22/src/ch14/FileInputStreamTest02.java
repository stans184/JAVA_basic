package ch14;

import java.io.FileInputStream;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		
		int i;
		
		// try catch 안에다가 넣으면, autoclose 가 되므로 close 를 신경써줄 필요가 없다
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			
			// read 값이 -1 이라는 건, 더이상 읽을 값이 없다는 말
			// 끝날때까지읽고, 문자로 변환해서 출력해라
			while ( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
