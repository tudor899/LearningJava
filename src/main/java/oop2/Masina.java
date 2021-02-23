package oop2;


public class Masina {
    Motor motor;
    private int anulFabricatiei;
    private int pret;
    private boolean isNew;
    private int nrUsi;


    public Masina() {
    }

    public int getAnulFabricatiei(){return anulFabricatiei;}
    public int getPret(){return pret;}
    public boolean getIsNew(){return isNew;}
    public int getNrUsi(){return nrUsi;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}
    public void setIsNew(boolean isNew){this.isNew = isNew;}
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
