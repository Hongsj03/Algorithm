import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int res = a * b * c;

		String result = Integer.toString(res);
		
		System.out.println(countChar(result,'0'));
		System.out.println(countChar(result,'1'));
		System.out.println(countChar(result,'2'));
		System.out.println(countChar(result,'3'));
		System.out.println(countChar(result,'4'));
		System.out.println(countChar(result,'5'));
		System.out.println(countChar(result,'6'));
		System.out.println(countChar(result,'7'));
		System.out.println(countChar(result,'8'));
		System.out.println(countChar(result,'9'));

	}

	public static int countChar(String str, char ch) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}

}
