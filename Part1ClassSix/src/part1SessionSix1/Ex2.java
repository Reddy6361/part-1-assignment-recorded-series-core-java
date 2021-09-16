package part1SessionSix1;

/*Thread Synchronization:
 * When 2 threads are operating on common data the data might get corrupted because of 
 * multitasking , to make the thread operates one after another we use synchronized 
 * keyword, the thread which is acquired the lock can only execute the block whereas 
 * the other thread would be in wait states only when the first thread release the
 *  lock the other thread will get opportunity and execute the lock.
*/
public class Ex2 extends Ex2_1 {
	public static void main(String[] args) {
		Ex2 ex = new Ex2();
		ex.start();
		synchronized (ex) {
			try {
				ex.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(total);
		}
	}
}
