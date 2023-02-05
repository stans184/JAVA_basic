package ch15;

import java.io.FileReader;

public class FileReaderTest01 {
	
	public static void main(String[] args) {
		
		
		// FileInputStream 으로 하면 byte 로 읽는 거기 때문에 한글 등 다른 문자는 다 깨진다
		try (FileReader fis = new FileReader("reader.txt")){
			int i;
			
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
