package ch22_multiThread;

class Bank{
	private int money = 10000;
	
	// synchronized 선언된 method 가 실행되는 도중엔 그 method 가 포함된 resource, class 를 lock 을 걸어서 
	// 다른 instance 에서 접근하지 못하도록 해야한다
	// method 에 synchronized 선언을 하는 방법과, method 안에서 synchronized 처리하는 방법이 있다
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		// save method 를 바로 처리하지 않고, 3000 milisec 의 대기시간 을 가진 이후에 실행한다
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public synchronized void outMoney(int minus) {
		
		// synchronized (shared resource)
		synchronized (this) {
			int m = getMoney();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m - minus);
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	public void run() {
		// 여기서도 synchronized 선언할 수 있다
		// synchronized (Syncmain.myBank)
		System.out.println("save start");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
		System.out.println("save end");
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("consume start");
		SyncMain.myBank.outMoney(5000);
		System.out.println("outMoney(5000) : " + SyncMain.myBank.getMoney());
		System.out.println("consume end");
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		
		Park park = new Park();
		park.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		save start
//		consume start
//		outMoney(5000) : 5000
//		saveMoney(3000) : 13000
//		Park 씨가 소비를 하는 동안, 0.2초 후에 ParkWife 가 돈을 불러와서 소비를 했고, 그 값을 은행에 저장했다
//		근데 Park 이 다시 실행이 되고, parkwife 보다 먼저 가져온 은행 잔고에다가 저금을 하고 그 값이 업데이트가 되었다
//		결국 먼저 실행된 thread 가 delay Time 을 가지며 실행되고 있었는데, 후속 thread 가 먼저 끝나버린 상황
//		이런 상황에서는 shared resource, 공용으로 사용하는 자원에서 그 값을 같이 건드리는 method 를 synchronized 처리를 한다

		ParkWife wife = new ParkWife();
		wife.start();
	}
}
