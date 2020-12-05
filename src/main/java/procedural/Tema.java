package procedural;

import java.util.Scanner;

public class Tema {
    //1. Foloseste metodele din clasa String
    // *      length(), toUpperCase(), toLowerCase(), isEmpty(), charAt(), contains(), startsWith(), endsWith()
    // *      pentru a printa lungimea unui text, a transforma toate literel in litere mari sau mici
    // *      A gasi la ce index se afla o litera
    // *      Pentru a verifica daca textul contine un caracter sau o secventa de caractere
    // *      Daca incepe cu o secventa sau daca se termina
    public static void main(String[] args) {
        String text = "Tema de casa";
        System.out.println("Lungimea variabilei text este " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("isEmpty: " + text.isEmpty());
        System.out.println("Caracterul cu numarul 6 este " + text.charAt(6));
        System.out.println("Stringul contine 'care'?: " + text.contains("care"));
        System.out.println("Stringul incepe cu litera 't'?: " + text.startsWith("t"));
        System.out.println("Stringul se incheie cu litera 'a'?: " + text.endsWith("a"));

        //2. Determina daca un numar primit de la tastatura este divizbil si cu 3 si cu 5 dar nu divizibil doar cu 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int numar = scanner.nextInt();
        if (numar % 3 == 0 && numar % 5 == 0) {
            System.out.println("Numarul introdus este divizibil si cu cifra 3 si cu cifra 5");
        } else if (numar % 3 == 0) {
            System.out.println("Numarul introdus este divizibil doar cu cifra 3");
        } else {
            System.out.println("Numarul nu este divizibil si cu cifra 3 si cu cifra 5 sau divizibil doar cu cifra 3");
        }


    }
}