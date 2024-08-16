import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, C, K;
        int result = 0;
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            C = sc.nextInt();
            K = sc.nextInt();
            result += C * K;
        }
        System.out.println(result);
    }
}