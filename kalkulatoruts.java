//12S25020 Julia Simatupang
//12S25057 Dian Petrus Panjaitan
import java.util.*;
import java.lang.Math;

public class kalkulatoruts {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int penjumlahan, pengurangan, perkalian, pembagian;
        String pilihan;
        int bilangan1, bilangan2;

        pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            bilangan1 = Integer.parseInt(input.nextLine());
            bilangan2 = Integer.parseInt(input.nextLine());
            penjumlahan = bilangan1 + bilangan2;
            System.out.println(penjumlahan);
        } else {
            if (pilihan.equals("2")) {
                bilangan1 = Integer.parseInt(input.nextLine());
                bilangan2 = Integer.parseInt(input.nextLine());
                pengurangan = bilangan1 - bilangan2;
                System.out.println(pengurangan);
            } else {
                if (pilihan.equals("3")) {
                    bilangan1 = Integer.parseInt(input.nextLine());
                    bilangan2 = Integer.parseInt(input.nextLine());
                    perkalian = bilangan1 * bilangan2;
                    System.out.println(perkalian);
                } else {
                    if (pilihan.equals("4")) {
                        bilangan1 = Integer.parseInt(input.nextLine());
                        bilangan2 = Integer.parseInt(input.nextLine());
                        pembagian = (double) bilangan1 / bilangan2;
                        System.out.println(pembagian);
                    }
                }
            }
        }
    }
}
