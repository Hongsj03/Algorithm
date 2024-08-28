import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 9;
        int[] a = new int[arrSize];
        int max = a[0];
        int index = 0;
        for (int i = 0; i < arrSize; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}