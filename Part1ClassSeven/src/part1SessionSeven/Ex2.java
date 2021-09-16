package part1SessionSeven;

/*Setting and getting name of thread:
 * */
public class Ex2 extends Thread {
	String name;

	public Ex2(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Ex2 ex = new Ex2("XXX");
		Ex2 ex1 = new Ex2("YYY");
		ex.setName("add amount");
		ex1.setName("withdraw amount");
		System.out.println(ex.getName());
		System.out.println(ex1.getName());
		ex.start();
		ex1.start();
	}

	@Override
	public void run() {
		System.out.println(this.name);
	}
}
