import java.util.*;

public class Main {
	public static void main(String[] args) { // 9086
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i=0;i<t;i++) {
			String input=scanner.next();
			char first=input.charAt(0);
			char last =input.charAt(input.length()-1);
			
			System.out.println(first +""+ last);
		}

	}
}
