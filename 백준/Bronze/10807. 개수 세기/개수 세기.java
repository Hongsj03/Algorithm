import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, v;
        int count = 0;
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        v = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (v == a[i]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}