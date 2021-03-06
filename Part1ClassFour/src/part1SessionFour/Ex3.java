package part1SessionFour;


/*1st concept i.e., Thread*/
/*Note:
 * 1)make sure in main method first object should be created 
 * and should call the start method and next we have to write different logic.
 * 
 * 2)here in output we can see clearly that main method runs for some time
 * and run method runs for some time and it repeats and order it executes
 * is unpredictable.
 * 
 * 3)main method is also considered as thread so here total of 2 threads are there.
 * */
public class Ex3 extends Thread {
	@Override
	public void run() { // eligible for multitasking
		for (int i = 0; i < 1000; i++) {
			System.out.println("run method");
		}
	}

	public static void main(String[] args) {
		// order 1
		Ex3 ex = new Ex3();
		ex.start();
		// order 2
		for (int i = 0; i < 1000; i++) {
			System.out.println("main method");
		}
		// here in output we can see clearly that main method runs for some time
		// and run method runs for some time and it repeats and order it executes
		// is unpredictable.
	}
}
