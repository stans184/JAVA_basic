package ch14;

import java.io.FileOutputStream;

public class FileOutputStreamTest02 {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		
		byte start = 65;
		
		for (int i = 0; i < bs.length; i++) {
			bs[i] = start;
			start += 1;
			
//			넣고나서 start 증가
//			bs[i] = start++;
		}
		
		try (FileOutputStream fos = new FileOutputStream("output2.txt", true)){
			
			fos.write(bs);
			fos.write('\n');
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}
