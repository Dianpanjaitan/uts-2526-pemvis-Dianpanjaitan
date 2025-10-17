// 12S25020-Julia Simatupang
// 12S25057-Dian Petrus Panjaitan
import java.util.*;
import java.lang.Math;

public class fibonacci {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, fib, jumlah, n, i;

        n = Integer.parseInt(input.nextLine());
        a = 1;
        b = 1;
        jumlah = 0;
        for (i = 1; i <= n; i++) {
            jumlah = jumlah + a;
            fib = a;
            a = b;
            b = fib + b;
        }
        System.out.println(jumlah);
    }
}
