package part1SessionOne;

/*COUNT THE NUMBER OF WORDS IN GIVEN STATEMENT ?*/
public class Ex2 {
	public static void main(String[] args) {
		String str = "Hello my Name is Yog"; // bug is if there is space at beginning of
		// sentence it will consider it as word too so we always trim first then we
		// split based on spaces.
		String[] s = str.trim().split(" "); // trim to trim first and last spaces.
		System.out.println(s.length); // prints number of elements present in s array.

		// * to print words *//
		for (String string : s) {
			System.out.println(string);
		}

	}
}
