import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		double sum = 0.0;
		int[] exam= new int[sc.nextInt()];

		for (int i = 0; i < exam.length; i++) {
			exam[i] = sc.nextInt();
		}

		for (int i = 0; i < exam.length; i++) {
			if(exam[i]>max) {
				max=exam[i];
			}
		}

		for (int i = 0; i < exam.length; i++) {
			sum+=exam[i];
		}
		
		System.out.println((sum/max)*100/exam.length);

	}
}