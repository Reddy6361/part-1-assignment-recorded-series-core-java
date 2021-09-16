package p1;

/*
 * Finalize:
 * ---------
 * 1) is a method present inside object class.
 * 2) garbage collection logic is implemented in Finalize method.
 * */
public class Ex5 extends Object {
	protected void finalize() {
		System.out.println(1000);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ex4 ex = new Ex4();
		ex= null;
		System.gc(); // it will call GC and will print anything inside finalize block. 
		// Note: if we dont make ex= null then there is no concept of garbage collection.
	}
}
