package oop4.colectii;

public class MainArray {
    public static void main(String[] args) {
        int[] array = new int[0]; // String-ul este immutable == valorile nu pot fi modificate
                                  // Array-ul e mutable, dar nu-si poate modifica lungimea

        // String a = "apa";
        //a = "lemn";

        array = new int[5];
        System.out.println(array);

        int[] arrayNou = new int[3];
        for(int i = 0; i < arrayNou.length; i++){
            arrayNou[i] = array[i];
        }

    }
}
