package oop3;

public class Profesor extends Persoana{
    private Materie materie;

    public Profesor(){}

    public Materie getMaterie(){return materie;}

    public Profesor(String nume, String prenume, int varsta, Materie materie){
        super(nume, prenume, varsta);
        this.materie = materie;
    }



}
  /*  public Caroserie(String caroserie, int nrUsi, boolean isNew){
        this.caroserie = caroserie;
        setNrUsi(nrUsi);
        setIsNew(isNew);*/
 /*public int getAnulFabricatiei(){return anulFabricatiei;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}*/