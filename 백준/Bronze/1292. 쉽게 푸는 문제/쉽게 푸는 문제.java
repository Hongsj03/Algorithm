import java.util.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j <= i; j++) {
				num.add(i + 1);
			}
		}
		
		for(int i=a-1;i<=b-1;i++) { // 배열의 인덱스를 고려하므로 -1
			sum+=num.get(i);
		}
		System.out.println(sum);
	}
}