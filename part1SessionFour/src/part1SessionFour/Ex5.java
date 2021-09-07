package part1SessionFour;

/* 2nd concept i.e., runnable */
/*Note:
 * 1) here we don't have start() method by default so we 
 * create object and also create thread class to get start() method.
 * 
 * 2)here in output we can see clearly that main method runs for some time
 * and run method runs for some time and it repeats and order it executes
 * is unpredictable.
 * 
 * 3)main method is also considered as thread so here total of 3 threads are there.
 * */
public class Ex5 implements Runnable { // run() only
	String name;

	Ex5(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.name);
		}
	}

	public static void main(String[] args) {
		Ex5 ex = new Ex5("XXX"); // object to get reference variable.
		Thread t1 = new Thread(ex); // Thread object to get start() method.
		t1.start();

		Ex5 ex1 = new Ex5("YYY"); // object to get reference variable.
		Thread t2 = new Thread(ex1); // Thread object to get start() method.
		t2.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("main");
		}
	}

}
