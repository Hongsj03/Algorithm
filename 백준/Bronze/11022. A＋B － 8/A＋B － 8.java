import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            r[i] = x1[i] + x2[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i+1) + ": " + x1[i] + " + " + x2[i] + " = " + r[i]);
        }

    }
}