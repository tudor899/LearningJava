package oop2;


public class Masina {
    Motor motor;
    int anulFabricatiei;
    int pret;
    boolean isNew;
    int nrUsi;

    public Masina() {
    }

    public Masina(int anulFabricatiei, int pret, int nrUsi, boolean isNew, Motor motor) {
        this.anulFabricatiei = anulFabricatiei;
        this.pret = pret;
        this.nrUsi = nrUsi;
        this.isNew = isNew;
        this.motor = motor;

    }
}
/*
//tema: o clasa de baza masina
2 clase care extind clasa masina cu proprietati noi
inca o clasa care se numeste motor
toate masinile au motor
creez un main in care sa fac instante din fiecare clasa
*/
