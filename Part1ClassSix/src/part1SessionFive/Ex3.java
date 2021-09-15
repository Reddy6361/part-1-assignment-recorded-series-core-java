package part1SessionFive;

/*Thread Pool:
 * 
 * */
public class Ex3 extends Thread {
	public static void main(String[] args) {
		Ex3 ex = new Ex3();
		System.out.println(ex.getState());
		ex.start();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ex.getState());
	}
	public void run () {
		System.out.println("test");
	}
}
