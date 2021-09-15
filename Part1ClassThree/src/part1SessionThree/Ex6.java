package part1SessionThree;

/*Assignment 1:
 * WRITE A PROGRAM TO FIND HOW MANY a's and b's are there in (aabaaaabaa)?*/
public class Ex6 {
	public static void main(String[] args) {
		String str = "aabaaaabaa";
		int a=0; // to count number of a's as number of times if condition for a runs its value keeps on increasing
		int b =0; // to count number of b's as number of times else if condition for b runs its value keeps on increasing
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a') {
				a++; //
			}else if(str.charAt(i)=='b') {
				b++;
			}
		}
		System.out.println("number of a's in given string are :"+a);
		System.out.println("number of b's in given string are :"+b);
	}
}
