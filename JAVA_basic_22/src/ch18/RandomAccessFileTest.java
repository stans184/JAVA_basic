package ch18;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws Exception {
		
		// read / write 를 모두 사용할 수 있음
		// stream class 와는 용도가 다른데,, 이런 나중에 찾아봐야함
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(184);
		System.out.println("pos : " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos : " + rf.getFilePointer());
		rf.writeUTF("hello");
		System.out.println("pos : " + rf.getFilePointer());
		
		// 커서 포인터를 다시 맨앞으로 돌려놔야함
		// 하지않으면 에러 발생
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
