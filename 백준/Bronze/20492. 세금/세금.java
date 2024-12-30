import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (int) (n * 0.78);
		int b = (int) (n * 0.8 + (n * 0.2 * 0.78));

		System.out.println(a + " " + b);

	}
}
