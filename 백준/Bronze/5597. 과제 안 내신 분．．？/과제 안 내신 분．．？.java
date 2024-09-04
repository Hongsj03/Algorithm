import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] student = new int[30];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			student[num - 1] = 1;
		}
		for (int i = 0; i < student.length; i++) {
			if (!(student[i] == 1)) {
				System.out.println(i+1);
			}
		}
	}
}
