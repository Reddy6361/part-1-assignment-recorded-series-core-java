package part1SessionThree;

/*Assignment 2:
 * output:
 * 1
 * 23
 * 456
 * 78910
 * 1112131415
 * */
public class Ex7 {
	public static void main(String[] args) {
		int k = 1;// 2.......15
		for (int r = 1; r <= 5; r++) { // 1 2 3 4 5
			for (int c = 1; c <= r; c++) { // 1 2 3 4 5
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
