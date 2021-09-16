package p1;

/*
 * Wrapper class:
 * 1) Here the values are stored in the object.
 * 2) The process of storing the value inside an object is called as wrapping or boxing.
 * 3)Reading the value from the object is called as unboxing.
 * */
public class Ex3 {
	public static void main(String[] args) {
		Integer i = 10; // or Integer i = new Integer(10);
		System.out.println(Integer.MAX_VALUE); // gives max value of integer.
		System.out.println(i.longValue()); // converts integer into long.
		System.out.println(i.hashCode()); // converts integer into hash code
		System.out.println(Integer.SIZE); // gives size of the Integer i.e, 4 bytes--> 32bits(1byte=4bits)
		System.out.println(i.toString());// converts integer into string
		System.out.println(i.doubleValue());// converts integer into double
		System.out.println(i.byteValue());// converts integer into byte value.

	}
}
