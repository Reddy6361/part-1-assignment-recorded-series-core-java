package part1SessionFour;

/*2nd Example for Thread concept*/
/*total of 4 threads are there*/
public class Ex4 extends Thread {
	String name;

	Ex4(String name) {
		this.name = name;
	}

	@Override
	public void run() { // eligible for multitasking
		for (int i = 0; i < 10; i++) {
			System.out.println(this.name);
		}
	}

	public static void main(String[] args) {
		Ex4 ex = new Ex4("XXX");
		Ex4 ex1 = new Ex4("YYY");
		Ex4 ex2 = new Ex4("ZZZ");
		ex.start(); // thread 1 starts
		ex1.start(); // thread 2 starts
		ex2.start(); // thread 3 starts
	}
}
