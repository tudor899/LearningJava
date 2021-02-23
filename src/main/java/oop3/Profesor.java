package oop3;

public class Profesor extends Persoana{
    private Facultati facultate;

    public Profesor(){}

    public Facultati getFacultate(){return facultate;}

    public Profesor(String nume, String prenume, int varsta, Facultati facultate){
        super(nume, prenume, varsta);
        this.facultate = facultate;
    }



}
  /*  public Caroserie(String caroserie, int nrUsi, boolean isNew){
        this.caroserie = caroserie;
        setNrUsi(nrUsi);
        setIsNew(isNew);*/
 /*public int getAnulFabricatiei(){return anulFabricatiei;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}*/