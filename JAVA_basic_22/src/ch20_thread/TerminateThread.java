package ch20_thread;

import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		
		// 무한 루프를 돌릴 때,
		// 계속 실행해야 하는 프로그램이 있을 때
		// thread 의 flag 로 off/on 을 해줄 수 있다
		while (!flag) {
			try {
				sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThread thA = new TerminateThread("A");
		TerminateThread thB = new TerminateThread("B");
		TerminateThread thC = new TerminateThread("C");
		
		thA.start();
		thB.start();
		thC.start();
		
		while (true) {
			int in = System.in.read();
			
			if (in == 'A') {
				thA.setFlag(true);
			}
			else if (in == 'B') {
				thB.setFlag(true);
			}
			else if (in == 'C') {
				thC.setFlag(true);
			}
			else if (in == 'M') {
				thA.setFlag(true);
				thB.setFlag(true);
				thC.setFlag(true);
				break;
			}
			else System.out.println("Wrong input");
		}
		
		System.out.println("main end");
	}
}