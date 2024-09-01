import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int i;

        s = sc.nextLine();
        i = sc.nextInt();
        System.out.print(s.charAt(i - 1));
    }
}