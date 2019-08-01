package day12;

public class ThreadD extends Thread {

	@Override
	public void run() {
		
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(5000); // milliseconds
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(currentThread().getName());
		}
		
	}

	public static void main(String[] args) {
		
		ThreadD t1 = new ThreadD();
		ThreadD t2 = new ThreadD();
		ThreadD t3 = new ThreadD();
		ThreadD t4 = new ThreadD();
		ThreadD t5 = new ThreadD();
		ThreadD t6 = new ThreadD();
		ThreadD t7 = new ThreadD();
		
		t1.setName("thread t1");
		t2.setName("thread t2");
		t3.setName("thread t3");
		t4.setName("thread t4");
		t5.setName("thread t5");
		t6.setName("thread t6");
		t7.setName("thread t7");
		
		t1.start();
		t2.start();
		t3.start();
		try { // will run everything above first (t1 - t3)
			t3.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		t4.start();
		t5.start();
		try { // then will run everything above here (t4 - t5)
			t5.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		t6.start(); // then will finally run everything here (t6 - t7)
		t7.start();

	}

}
