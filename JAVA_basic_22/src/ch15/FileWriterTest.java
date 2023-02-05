package ch15;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("writer.txt")){
			
			fw.write('A');
			
			char[] buff = {'b', 'C', 'd', 'E'};
			
			fw.write(buff);
			fw.write("hello, its working well");
			fw.write(buff, 2, 2);
			fw.write("65");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("system END");
	}
}
