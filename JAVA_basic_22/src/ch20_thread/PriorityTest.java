package ch20_thread;

class PriorityThread extends Thread{
	
	public void run() {
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println(t + "start");
		
		for (int i = 0; i <= 100000; i++) {
			sum += i;
		}
		
		System.out.println(t.getPriority() + "end");
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		
		// Thread[Thread-6,7,main]start
		// 두번째가 우선순위를 나타냄
		// 완벽히 일치하지는 않지만, 대체적으로 우선순위가 높은 거부터 처리하고 종료시키는 경향이 있음
//		for (int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
//			PriorityThread pt = new PriorityThread();
//			pt.setPriority(i);
//			pt.start();
//		}
		
		// 우선순위를 극단적으로 볼 수 있는 예제
		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.NORM_PRIORITY);			// normal priority 는 5 이다
		pt2.setPriority(Thread.MAX_PRIORITY);
		pt3.setPriority(Thread.MIN_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}
}
