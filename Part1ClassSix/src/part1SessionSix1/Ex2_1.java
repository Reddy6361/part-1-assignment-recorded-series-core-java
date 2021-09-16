package part1SessionSix1;

public class Ex2_1 extends Thread {
	static int total = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 1000; i++) {
			total = total + i;
		}
		notify();
	}
}
