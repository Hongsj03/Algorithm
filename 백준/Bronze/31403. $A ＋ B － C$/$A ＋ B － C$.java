import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String s = a + "" + b;
		int ab = Integer.parseInt(s);
//		System.out.println(s);
		System.out.println((a + b) - c);
		System.out.println(ab - c);
	}
}
