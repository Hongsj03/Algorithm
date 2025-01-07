import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n0, n1, n2, n3, n4;
		int cnt = 1;
		while (true) {
			n0 = sc.nextInt();
			if (n0 == 0)
				break;
			n1 = n0 * 3;
			if ((n1 % 2) == 0) {
				n2 = n1 / 2;
			} else {
				n2 = (n1 + 1) / 2;
			}
			n3 = n2 * 3;
			n4 = n3 / 9;
			if ((n1 % 2) == 0) {
				System.out.println(cnt + ". " + "even " + n4);
			} else {
				System.out.println(cnt + ". " + "odd " + n4);
			}
			cnt++;
		}
	}
}
