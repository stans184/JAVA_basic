package ch20_thread;

class MyThread extends Thread{
	
	public void run() {
		
		for (int j = 0; j < 200; j++) {
			System.out.print(j + " ");
		}
	}
}

// class 가 다른 상위 class 를 상속받고 있는 상태라면, Runnable 을 구현함으로써 thread 를 정의할 수 있다
// 이 경우 runnable 안에 있는 run method 를 구현해야 한다
class YourThread implements Runnable{

	@Override
	public void run() {
		for (int j = 0; j < 200; j++) {
			System.out.print(j + " ");
		}		
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		// Thread[main,5,main]start
		// [main method 에서 불렀다, 5번째 우선권 priority, thread group]

		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		// thread 를 상속받은 instance 가 아니므로 바로 start 할 수 없다
		// thread instance 를 하나 생성하는데, runnable instance 를 받아서 생성한다
		YourThread th3 = new YourThread();
		Thread th3p = new Thread(th3);
		
		th1.start();			// 이거 2개는 돌아가면서 찍힌다 0 0 1 1 2 2 
		th2.start();
		th3p.start();
		
		// 간단하게 thread 를 돌릴 경우는 하기와 같이 돌릴 수 있다
		// 위와 같이 돌릴땐, 여러 곳에 불러와서 돌릴 때
		Runnable rn = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RUN");
			}
		};
		
		rn.run();
		
		System.out.println(Thread.currentThread() + "end");
		// Thread[main,5,main]end
		// 제일 먼저 끝난 thread는 main thread
	}
}