package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	String name;
	String job;
	// serializable 처리가 필요한데, 가끔 처리가 안되는 변수들이 있다
	// 그런 경우 transient 를 변수명 앞에 넣어주면 해당 변수는 빼고 직렬화가 됨
	
	// person class constructor
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

// 원하는 부분만직렬화 하고 싶은 경우, externalizable 을 사용
class Person2 implements Externalizable{
	
	String name;
	String job;
	// serializable 처리가 필요한데, 가끔 처리가 안되는 변수들이 있다
	// 그런 경우 transient 를 변수명 앞에 넣어주면 해당 변수는 빼고 직렬화가 됨
	
	// person class constructor
	public Person2() {}
	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
	
	// externalizable 의 경우 하기 method 를 구현해야 함
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		
		// 원하는 parameter 만 read / write 하도록 설정 가능
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {

		obj.readUTF();
		obj.readUTF();
	}
}



public class SerializationTest{
	public static void main(String[] args) {
		
		Person person1 = new Person("Lee", "CEO");
		Person person2 = new Person("Kim", "secretary");
		
		// fileOutput 으로 파일을 열어
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
		// objectOutput 으로 원하는 대상을 보내고
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			// Person class 를 그냥 실행하면 NotSerializableException 이 발생한다
			// implements 를 해줘야함
			
			oos.writeObject(person1);
			oos.writeObject(person2);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// fileInput 으로 다시 파일을 불러들여서
		try (FileInputStream fis = new FileInputStream("serial.txt");
		// objectInput 으로 불러들임
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			// readObject 로 읽게 되면 object 형식이므로, Person Class 로 형변환을 해줘야 함
			// ClassNotFoundException 이 발생할 수 있음
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n END");
	}
}