package ch11;

public class LoggerTest {

	public static void main(String[] args) {
		
		MyLogger mylog = MyLogger.getLogger();
		
		mylog.log("test log");
		
		// console 에 출력되는 값은 jre 설정에서 확인할 수 있음
		// exception 이 발생하는 상황에서는 Log 를 잘 구현해야 대처할 수 있음
	}

}
