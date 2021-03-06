package oop3;

import java.util.Objects;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;


    public Persoana() {
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && nume.equals(persoana.nume) && prenume.equals(persoana.prenume);
    }
}



    /*Creeaza mai multe clase.
        1. Persoana (nume, prenume, varsta)
        2. Student care extinde Persoana si are facultate si an, materii
        3. Profesor care extinde persoana, la ce facultati preda
        4. Catatog unde sa apara notele studentul acordate de care profesor
        5. Enum de facultati

        in Main apelezi toate constructiile de obiecte principale

        ArrayList<Integer} note = new ArrayList<>();

        note.add(5);

        note.add(6);*/