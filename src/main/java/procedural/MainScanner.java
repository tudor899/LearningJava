package procedural;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int rezultat = scanner.nextInt();

        if (rezultat < 5) {
            System.out.println("Numarul este mai mic de 5");
        } else if (rezultat == 5) {
            System.out.println("Numarul este egal cu 5");
        } else {
            System.out.println("Numarul este mai mare de 5");
        }
    }
}
