package ch18;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File fi = new File("newFile.txt");
		
//		fi.createNewFile();
		
		System.out.println(fi.isFile());
		System.out.println(fi.isDirectory());
		System.out.println(fi.getName());
		System.out.println(fi.getAbsolutePath());
		System.out.println(fi.getPath());
		System.out.println(fi.canRead());
		System.out.println(fi.canWrite());
		
		fi.delete();		
	}
}
