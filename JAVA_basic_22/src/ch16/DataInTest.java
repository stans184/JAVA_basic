package ch16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInTest {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(184);
			dos.writeFloat(3.14F);
			dos.writeUTF("My name is hyun");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try (FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			// data in / out 의 경우 들어간 자료형 타입에 맞춰서 read type 을 설정해줘야 한다
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nEND");
	}
}
