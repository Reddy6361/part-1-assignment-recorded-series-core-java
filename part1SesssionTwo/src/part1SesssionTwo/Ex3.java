package part1SesssionTwo;

/*STRING IS IMMUTABLE*/

/* Note:
 * 1)Even if we reassign value to String reference variable it wont change instead its values there itself
 * instead it will create new object and store in it where as past object will go for
 * garbage collection so String class is IMMUTABLE.
 * 2) always use s1.equals(s2) to compare values of 2 Strings*/
public  class Ex3 {
	public static void main(String[] args) {
	 	String s1 = new String("xyz"); // object 1
		String s2 = new String("xyz"); // object 2
		System.out.println(s1 == s2); // compares object address.
		System.out.println(s1.equals(s2));// values are compared special type only for string
	}
}
