import java.util.*;

public class Main {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		int N=sc.nextInt();
		String sNum=sc.next();
		char []cNum=sNum.toCharArray();
		
		for(int i=0;i<N;i++) {
			sum+=cNum[i]-'0';
		}
	
		
		System.out.println(sum);
		
	}
}