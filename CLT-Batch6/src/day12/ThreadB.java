package day12;

public class ThreadB implements Runnable {
	
	@Override
	public void run() {
		System.out.println("thread is running using Runnable interface...");		
	}

	public static void main(String[] args) {
		
		ThreadB tb = new ThreadB();
		Thread t1 = new Thread(tb);
		Thread t2 = new Thread(tb);
		
		t1.start(); // invokes run()
		t2.start(); // invokes run()

	}

}
