package part1SessionOne;

/*REVERSE A GIVEN STRING ?
 * 1) create a string to be reversed and assign it to the variable.
 * 2) use decrimental for loop.
 * 3) use str.length() & str.charAt() methods.
 * 4) logic.
 * */
public class Ex1 {
	public static void main(String[] args) {
		String str = "pankaj sir academy";
		for (int i = str.length() - 1; i >= 0; i--) {
			// str.length() - 1 because index starts from zero
			System.out.print(str.charAt(i));
		}
	}
}
