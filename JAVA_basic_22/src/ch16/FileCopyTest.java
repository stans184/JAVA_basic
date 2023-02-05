package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long milisec = 0;
		
		// fileinputstream 으로 하면 시간이 좀 많이 소요됨, 5MB 파일 기준 28sec
		try (FileInputStream fis = new FileInputStream("a.zip")){
			FileOutputStream fos = new FileOutputStream("copy.zip");
			
			milisec = System.currentTimeMillis();
			
			int i;
			
			while ( (i = fis.read()) != -1) {
				fos.write(i);
			}
			
			milisec = System.currentTimeMillis() - milisec;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 중간에 buffer 를 생성하는 거로 하면, 5MB 파일 기준 0.04sec
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("out.zip"))){
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));
					
			milisec = System.currentTimeMillis();
			
			int j;
			
			while ( (j = bis.read()) != -1) {
				bos.write(j);
			}
			
			milisec -= System.currentTimeMillis();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(milisec + " ");
		
	}
}
