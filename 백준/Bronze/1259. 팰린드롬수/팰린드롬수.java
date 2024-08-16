import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            String Sreverse = sb.reverse().toString();

            if (s.equals("0"))
                break;

            if (s.equals(Sreverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}