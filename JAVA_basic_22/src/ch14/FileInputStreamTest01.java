package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
				// fis 에서 file 이 열리지 않은, null 인 상태에서도 닫아버리면 에러로 죽어버리기 때문에 try catch 를 진행
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		System.out.println("END");
		
	}
}
