package part1SessionOne;

import java.util.Scanner;

/*TO CHECK NUMBER OF OPENING AND CLOSING PARENTHESIS AND IF
 * SAME NUMBER PRINT NO ERROR IF NOT SAME PRINT ERROR ?*/
public class Ex3 {
	public static void main(String[] args) {

		String condition = "yes";
		while (condition.equals("yes")) {
			Scanner scan = new Scanner(System.in); // scanner class
			System.out.println("Enter the Paranthesis");
			String str = scan.next(); // taking string as input
			int count1 = 0;
			int count2 = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(') {
					count1++;
				} else if (str.charAt(i) == ')') {
					count2++;
				}
			}
			if (count1 == count2) {
				System.out.println("NO ERROR");

			} else {
				System.out.println("ERROR");
			}
			System.out.println("do you want to continue? Yes /No");
			condition = scan.next().toLowerCase();
		}
	}
}
