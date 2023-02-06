package ch22_multiThread;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibrary() {
		shelf.add("poter 1");
		shelf.add("poter 2");
		shelf.add("poter 3");
//		shelf.add("poter 4");
//		shelf.add("poter 5");
//		shelf.add("poter 6");
//		shelf.add("poter 7");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		// 현재 method 를 수행하고 있는 current thread 를 가져온다
		Thread t = Thread.currentThread();
		
		// 선반이 비어있다면 기다렸다가 가져가라
		while (shelf.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		
		String book = shelf.remove(0);
		System.out.println(t.getName() + " lend " + book);
		
		return book;
	}
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		notifyAll();
		// wait, notify 는 Object 의 method 이므로 어느 객체에서도 사용 가능하다
		// wait 에 들어간 thread 가 있다면 보통 notifyAll 로 모두 깨워서 경쟁을 시키는 방법이 더 공정하다?!
		// 이럴 경우, shared resource 가 모자란 상황을 if 로 검사하지 않고, while 로 검사한다
		// jack waiting end
		// jack waiting start
		System.out.println(t.getName() + " return " + book);
	}
}

class Student extends Thread{
	
	public Student(String name) {
		super(name);
	}
	
	public void run() {
		
		try {
			// 책을 빌려서
			String bookTitle = LibraryMain.myLib.lendBook();
			// 빈 책이면 그냥 끝내버리고
			if (bookTitle == null) return;
			// 5초 동안 책을 다 읽고
			sleep(5000);
			// 책을 반납한다
			LibraryMain.myLib.returnBook(bookTitle);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class LibraryMain {
	
	public static FastLibrary myLib = new FastLibrary();
	
	public static void main(String[] args) {
		
		Student john = new Student("john");
		Student jack = new Student("jack");
		Student jenny = new Student("jenny");
		Student paul = new Student("paul");
		Student han = new Student("han");
		
		// 학생 수보다 책 수가 모자랄 때, 빌리려고 하면 out of bound 가 뜬다
		// resourse 가 없는 상태
		// 첫번째 솔루션은 lendBook method 에 if 구문 추가하기
		// shelf.size() 가 0 보다 클때만 빌릴 수 있도록 하고, 없다면 null 반환
		// 근데 이 경우는, 책 빌리는걸 포기하는 것과 같다
		
		// 해결 할 수 있는 방법은, lendBook method 에서 shelf 가 비어있으면 wait() 을 하도록 지시하는 것
		
		john.start();
		jack.start();
		jenny.start();
		paul.start();
		han.start();
	}

	
}