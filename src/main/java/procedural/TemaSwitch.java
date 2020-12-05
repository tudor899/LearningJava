package procedural;

import java.util.Scanner;

//3. Dupa ce am primit un numar de la tastarura de la 1 la 7. Sa se faca cu switch care in ce zi a saptamanii suntem
public class TemaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int numarZi = scanner.nextInt();
        switch (numarZi){
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Ai introdus alt numar");
        //Se poate arata un rezultat pt oricare alt numar?
        }
    }
}
