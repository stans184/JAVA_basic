package ch10;

import java.util.Scanner;

public class PasswordTest {
	
	private String password;

	public String getPassword() {
		return password;
	}
	// 만들어진 exception 에 대한 구현
	// 여기서도 throw 를 하고, method 를 사용하는 곳에서 exception 을 처리
	public void setPassword(String password) throws PasswordException {
		
		if (password == null) {
			throw new PasswordException("Password cannot be NULL");
		}
		else if (password.length() < 6 ) {
			throw new PasswordException("Password should longer than 6 byte");
		}
		else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("Password should have numbers or special char");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PasswordTest test = new PasswordTest();
		
		// pw 를 입력받고
		System.out.print("Enter new PW : ");
		String pw = sc.nextLine();
		
		try {
			// 입력받은 pw 로 저장하려고 하는데
			test.setPassword(pw);
			// 제대로 저장되면 pw출력
			System.out.println("Your PW : " +test.getPassword());
			// 설정해놓은 예외상황이 발생되면 exception messege를 출력
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
