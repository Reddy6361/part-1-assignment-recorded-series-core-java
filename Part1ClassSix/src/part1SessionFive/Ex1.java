package part1SessionFive;

/*Thread Synchronization:
 * When 2 threads are operating on common data the data might get corrupted because of 
 * multitasking , to make the thread operates one after another we use synchronized 
 * keyword, the thread which is acquired the lock can only execute the block whereas 
 * the other thread would be in wait states only when the first thread release the
 *  lock the other thread will get opportunity and execute the lock.
*/
public class Ex1 {
	int balance =0;
	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		ex.account();
		System.out.println(ex.balance);
		
	}

	private void account() {
		Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			add();// this.add();
		}
	
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				sub();// this.add();
			}
			});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private synchronized void add() { //synchronized is used to make the add to complete first then go to subtract so that there wont be any data corruption.
		for(int i=0; i<1000;i++) {
			balance = balance+i;
		}
	}
	private synchronized void sub() {
		for(int i=0; i<1000;i++) {
			balance = balance-i;
		}
	}
}
