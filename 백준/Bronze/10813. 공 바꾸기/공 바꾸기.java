import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, m;
		int i = 0, j = 0;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] arr = new int[n];

		for (int x = 0; x < n; x++) {
			arr[x] = x + 1;
		}
		for (int x = 0; x < m; x++) {
			i = sc.nextInt() - 1;
			j = sc.nextInt() - 1;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int x = 0; x < n; x++) {
			System.out.print(arr[x]);
			if (x < n - 1)
				System.out.print(" ");

		}
	}

}