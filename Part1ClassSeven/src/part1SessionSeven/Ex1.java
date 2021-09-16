package part1SessionSeven;

/*Thread Priority:
 * 1) it decides which thread runs first and which thread runs later.\
 * 2) if we set the priority then it is the request made to thread scheduler there is 
 * no assuring that it will be processed of approved.
 * 3) the minimum thread priority is 1 and maximum thread priority is 10, normal 
 * thread priority is 5, however we can set thread priority with number between 1-10.
 * 
 * */
public class Ex1 extends Thread {
	@Override
	public void run() {
		System.out.println(this.name);
	}
	
	String name;
	public Ex1(String name) {
		this.name= name;
	}

	public static void main(String[] args) {
		Ex1 ex = new Ex1("XXX");
		Ex1 ex1 = new Ex1("YYY");
		ex.setPriority(10); // with highest priority will run first.
		ex1.setPriority(1);
		System.out.println(ex.getPriority());
		System.out.println(ex1.getPriority());
		ex.start();
		ex1.start();
	}
}
