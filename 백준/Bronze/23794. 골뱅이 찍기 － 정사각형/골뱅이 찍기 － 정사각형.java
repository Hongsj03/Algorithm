import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i;
        String s = "@";
        N = sc.nextInt();
        for (i = 0; i < N + 2; i++)
            System.out.print(s);
        System.out.print("\n");
        for (i = 0; i < N; i++) {
            System.out.print(s);
            for (int j = 0; j < N; j++) {
                System.out.print(" ");
            }
            System.out.print(s);
            System.out.print("\n");
        }
        for (i = 0; i < N + 2; i++)
            System.out.print(s);
    }
}