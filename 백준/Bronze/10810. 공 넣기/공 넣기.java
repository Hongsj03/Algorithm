import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        int N, M, i, j, k;
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];

        for (int x = 0; x < M; x++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for (int y = i - 1; y < j; y++) {
                arr[y] = k;
            }
        }
        for (int x = 0; x < N; x++) {
            System.out.print(arr[x]);
            if (x < N - 1) {
                System.out.print(" ");
            }
        }
    }
}