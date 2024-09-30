import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] num = new int[n];
		int i = 0, j = 0;
		for (int x = 0; x < num.length; x++) {
			num[x] += 1 + x;
		}

		for (int x = 0; x < m; x++) {
			i = sc.nextInt()-1;
			j = sc.nextInt()-1;
			int temp = 0;
			while(i<j) {
				temp=num[i];
				num[i++]=num[j];
				num[j--]=temp;
				
			}
		}
		
		for (int x = 0; x < num.length; x++) {
			System.out.print(num[x]+" ");
		}

	}
}