package procedural;

import java.util.Scanner;

public class MainScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int rez = scanner.nextInt();

        // operatori de comparatie: "<", ">",  "==", "<=", ">=" -- (nu exista "=>" sau "=<"), "!="
        if (rez % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

        // operatori logici : "&&", "||",

        int a = 5;
        int b = 7;

        if (!(a > 3 && b < 8) || a >= 5) {

        }

    }
}
