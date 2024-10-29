import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int x = 0, y = 0, z = 0;

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				x += 1;
			}
			if (a[i] == -1) {
				y += 1;
			}
			if (a[i] == 0) {
				z += 1;
			}
		}

		int half = 0;
		if (n % 2 != 0) {
			half = (n / 2) + 1;
		} else {
			half = n / 2;
		}

		if (z >= half) {
			System.out.println("INVALID");
		}
		if (x > y) {
			System.out.println("APPROVED");
		} else {
			System.out.println("REJECTED");

		}
	}
}