package ch16;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		int i;
		
		// FileInputStream 으로 읽으면 한글이 깨짐
		// inputstreamreader 로는 uft-8 형식 잘 읽을 수 있음
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}
