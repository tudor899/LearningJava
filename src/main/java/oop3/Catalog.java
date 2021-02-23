package oop3;

public class Catalog extends Student{
    private int[] note;


public Catalog(){
}

public int[] getNote(int[] note){return note;}

public Catalog(String nume, String prenume, String materie, int note){
    super(nume,prenume,materie);
    getNote(note);


}
 /*public int getAnulFabricatiei(){return anulFabricatiei;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}*/


}