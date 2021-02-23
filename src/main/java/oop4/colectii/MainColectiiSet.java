package oop4.colectii;

import oop3.Materie;

import java.util.HashSet;

public class MainColectiiSet {

    public static void main(String[] args) {
        // Set poate contine doar valori unice (fara duplicate, duplicatele vor fi excluse)
        HashSet<Materie> materies = new HashSet<>();
        materies.add(Materie.MEDICINA);
        materies.add(Materie.MEDICINA); // exclus : Materia medicina exista deja (linie redundanta)
        materies.add(Materie.INFORMATICA);
        materies.add(Materie.INFORMATICA);// exclus : Materia Informatica exista deja
        materies.add(Materie.INFORMATICA); // exclus : Materia Informatica exista deja
        materies.add(Materie.DREPT);
        materies.add(Materie.MECANICA);

        for (Materie materie : materies) {
            System.out.println(materie);
        }
    }

}
