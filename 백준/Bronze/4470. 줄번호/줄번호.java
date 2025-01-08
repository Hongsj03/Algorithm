import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ". " + arr[i]);
		}
	}
}
