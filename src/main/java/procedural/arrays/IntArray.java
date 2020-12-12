package procedural.arrays;

public class IntArray {
    public static void main(String[] args) {

        int[] arrayInt2 = new int[]{1, 2, 3, 4};
        int[] arrayInt;
        arrayInt = new int[]{5, 6, 7, 45, 3, 3};

        // loops for

        // Printare valoare cu valoare fara for
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println("========================");

        // varianta hardcodata pentru ca nu am pasat dinamic lungimea array-ului
        for (int i = 0; i < 6; i++) {
            System.out.println(arrayInt[i]);
        }

        System.out.println("=========Printare dinamica========");
        // varianta hardcodata pentru ca nu am pasat dinamic lungimea array-ului
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        // enhanced for
        for (int valoare : arrayInt) {
            System.out.println(valoare);
        }

        System.out.println("==========While");
        // while
        int i = 0;
        int len = arrayInt.length;
        while (i < len) {
            System.out.println(arrayInt[i]);
            i = i + 1;
        }

        System.out.println("=======do while");
        i = 0;
        do {
            System.out.println("Rulez do While: " + i);
            i = len + ++i;
            if (i == 105) {
                i = 0;
            }
        } while (i > len);

        /*String sir = "Ana are mere";
        int length = sir.length();*/


    }
}
