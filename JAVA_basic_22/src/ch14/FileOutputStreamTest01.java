package ch14;

import java.io.FileOutputStream;

public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("output.txt")){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}
