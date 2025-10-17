//12S25020 - Julia Simatupang
//12S25057 - Dian Petrus Panjaitan
import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        double nr, total, max, min;
        double[] ns = new double[4];

        total = 0;
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ":");
            ns[i] = Double.parseDouble(input.nextLine());
            total = total + ns[i];
        }
        nr = total / 4;
        max = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] > max) {
                max = ns[i];
            }
        }
        min = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[1];
            }
        }
        System.out.println("ratarata:" + nr);
        System.out.println("tertinggi:" + max);
        System.out.println("terendah:" + min);
    }
}
