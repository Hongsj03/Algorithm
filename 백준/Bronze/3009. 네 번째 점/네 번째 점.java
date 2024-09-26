import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[3];
		int y[] = new int[3];
		int x_output = 0, y_output = 0;

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		if(x[0]==x[1]) {
			x_output=x[2];
		}else if(x[0]==x[2]){
			x_output=x[1];
		}
		else {
			x_output=x[0];
		}
		
		if(y[0]==y[1]) {
			y_output=y[2];
		}else if(y[0]==y[2]){
			y_output=y[1];
		}else {
			y_output=y[0];
		}
		

		System.out.print(x_output + " ");
		System.out.println(y_output);

	}
}