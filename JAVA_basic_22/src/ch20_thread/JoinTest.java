package ch20_thread;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;				// member 변수이므로 initial 하지 않아도 됨
							// 만약 method 안에 넣으면 지역변수로 들어가서 initial 을 따로 해줘야 함
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		
		for (int i = start; i <= end; i++) {
			total += i;
		}
	}
	
	// 하기 프로그램에서는 thread 가 총 3개 돌아가고 있는 상황
	// main, jt1, jt2
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		// main method / thread 가 끝나기 전에 jt1, jt2 의 결과를 보고 끝내고 싶으면
		// 각 thread 에 join 을 걸어야 한다
		// 근데 jt1, jt2가 끝나는 시점까지 기다렸다가 main thread 가 진행되는데, 돌아오지 못하는 경우가 발생하기도 한다
		// 그럴때를 대비해서 InterruptedException 을 try~catch 로 걸어놓는다
		// 각 thread 에 대해서 join, 끝나기를 기다리라고 명령해놓았기 때문에
		// total 값이 정상적으로 출력된다
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int lastTotal = jt1.total + jt2.total;
		
		// 매번 값이 다르게 나올 수가 있다
		// 각 thread 에서 덧셈이 이루어져서 total 값으로 저장되는데
		// main method 가 끝나는 시점에 각 thread 의 계산이 끝나지 않을 경우도 있기 때문에
		System.out.println("total of jt1 : " + jt1.total);
		System.out.println("total of jt2 : " + jt2.total);
		
		System.out.println("sum all total : " + lastTotal);
		
		System.out.println(Thread.currentThread() + "end");
	}
}
