package ch10;
// exception class 를 상속받아서 내가 원하는 exception 을 만듬
public class PasswordException extends Exception{
	
	public PasswordException (String message) {
		super(message);
	}
}
