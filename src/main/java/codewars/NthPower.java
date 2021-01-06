package codewars;

public class NthPower {
    public static void main(String[] args) {
        int[] numitor = {0, 1, 2, 3};
        int numar = 3;
        int rezultat = ridicareLaPutere(numitor, numar);
        System.out.println(rezultat);
    }

    public static int ridicareLaPutere(int[] numitor, int numar) {
        if (numar < 0 || numar >= numitor.length) {
            return -1;
        }
        int valoare = numitor[numar];
        int rezultat = valoare;
        for (int i = 1; i < numar; i++) {
            rezultat = rezultat * valoare;

        }
        return rezultat;
    }

}
