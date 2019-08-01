package day12;

class Reserve implements Runnable {
	
	int available = 5;
	int wanted;
	Reserve (int i) {
		wanted = i;
	}
	
	@Override
	public void run() {
		
			System.out.println("Available berths: " + available);
			if (available >= wanted) {
				// get the name of the passenger
				String name = Thread.currentThread().getName();
				// allocate the berth for him
				System.out.println(wanted + " Berths reserved for " + name);
				try {
					Thread.sleep(2000); // wait for printing the ticket
					available = available - wanted; // update the no. of available berths
				}
				catch (InterruptedException ie) {
					
				}
			}
			else {
				System.out.println("Sorry... no berth available");
			}
		
	}

}

public class ReservationNotSynchronized {

	public static void main(String[] args) {
		
		Reserve r = new Reserve(3);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.setName("Sulianto");
		t2.setName("Razli");
		t3.setName("Karthik");
		t1.start();
		t2.start();
		t3.start();

	}

}
