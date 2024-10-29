import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong() * 2;
		long poket = a + b;

		if (poket >= c) {
			System.out.println(poket - c);
		} else {
			System.out.println(poket);
		}

		scanner.close();
	}
}