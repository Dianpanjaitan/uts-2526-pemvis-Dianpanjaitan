import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, o;

        n = Integer.parseInt(input.nextLine());
        m = 1;
        o = 1;
        while (o <= n) {
            m = m * o;
            o = o + 1;
        }
        System.out.println(m);
    }
}
