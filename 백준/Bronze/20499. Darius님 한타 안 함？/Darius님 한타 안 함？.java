import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] tmp = str.split("/");
		int[] num = new int[tmp.length];

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(tmp[i]);
		}
		
		if(num[1]> num[0] + num[2]) {
			System.out.println("hasu");
		}
		else if(num[1]==0) {
			System.out.println("hasu");
		}
		else {
			System.out.println("gosu");
		}
	}
}
