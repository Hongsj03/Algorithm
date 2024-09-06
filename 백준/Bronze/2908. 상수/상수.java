import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x,y;
		int x_r=0,y_r=0;
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		while(x!=0) { 
			x_r=x_r*10+x%10;
			x=x/10;
			
		}
		
		while(y!=0) { 
			y_r=y_r*10+y%10;
			y=y/10;
			
		}
		
		if(x_r>y_r)
			System.out.println(x_r);
		if(x_r<y_r)
			System.out.println(y_r);
	}
}


