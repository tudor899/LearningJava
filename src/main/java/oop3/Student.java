package oop3;

public class Student extends Persoana{
    private Facultati facultate;
    private int an;
    private String materie;

    public Student(){

    }

    public Facultati getFacultate(){return facultate;}
    public int getAn(){return an;}
    public String getMaterii(){return materie;}

    public Student(String nume, String prenume, int varsta, Facultati facultate, int an, String materie){
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.materie = materie;
    }

}
 /*public int getAnulFabricatiei(){return anulFabricatiei;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}*/

/*  public Caroserie(String caroserie, int nrUsi, boolean isNew){
        this.caroserie = caroserie;
        setNrUsi(nrUsi);
        setIsNew(isNew);*/