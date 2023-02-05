package ch14;

import java.io.FileInputStream;

public class FileInputStreamTest03 {
	
	public static void main(String[] args) {
		
		int i;
		
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			
			// read(bs, 1, 9) 의 의미
			// bs 로 선언된 크기의 버퍼가 있다
			// 버퍼의 앞쪽에 1 만큼의 offset을 주고
			// 8개만 읽어라
			while ( (i = fis.read(bs, 1, 9)) != -1) {
				
				// input 되는 데이터는 26개면, 10개씩 끊긴다
				// 마지막 그룹에서는 6개만 남아서, 나머지 4개는 그전 데이터들이 남아있게 된다
//				for (int b : bs) {
//					System.out.print((char)b);
//				}
				
				// 읽은 개수만큼 출력하고 싶으면 i 값 내에서 반복하는 for 문을 생성해주면 된다
				for (int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "byte read");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
