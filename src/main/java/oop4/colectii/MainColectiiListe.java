package oop4.colectii;

import java.util.ArrayList;
import java.util.Iterator;

public class MainColectiiListe {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        // listele au toate operatiile de CRUD

        // C - create
        // R - read
        // U - update
        // D - delete

        // spre deosebire de array
        // R si U (dupa instantiere array-ul nu-si poate modifica lungimea
        //        deci nu-l poti scurta si nu poti lungi
        //        daca vrei asa ceva va trebui sa-ti creezi un array nou

        lista.add(1);
        lista.add(2);
        lista.add(7);
        lista.add(4);
        lista.add(6);
        lista.add(4);
        lista.add(7);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numarul este" + lista.get(i));
        }

        //  lista.remove(7); stergere de la indexul 7

        // Remove in loop ? folosim Iterator
        Iterator iter = lista.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        /*for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == 4) {
                lista.remove(i);
            }
        }*/

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Apple");
        aList.add("Mango");
        aList.add("Guava");
        aList.add("Orange");
        aList.add("Peach");

        for(int i = 0; i < aList.size(); i++){
            if(aList.get(i).equals("Orange")){
                aList.remove(i);
            }
        }


    }
}
