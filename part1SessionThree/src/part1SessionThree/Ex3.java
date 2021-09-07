package part1SessionThree;

/*CHECK STRING IF IT STARTS/ENDS WITH ANY LETTER ?*/
public class Ex3 {
	public static void main(String[] args) {
		String str = "aabccde";
		System.out.println(str.startsWith("a")); // true as given string starts with a.
		System.out.println(str.endsWith("e"));// true as given string ends with e.
		System.out.println(str.startsWith("d"));// false as given string doesn't starts with d.
		System.out.println(str.endsWith("f"));// false as given string ends starts with f.
	}
}
