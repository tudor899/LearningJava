package oop2;

public class Caroserie extends Masina {
    boolean esteMasinaDeFamilie;
    String caroserie;
    String culoare;


    public Caroserie(){
    }

    public Caroserie(boolean esteMasinaDeFamilie, String caroserie, String culoare){
        this.esteMasinaDeFamilie = esteMasinaDeFamilie;
        this.caroserie = caroserie;
        this.culoare = culoare;
    }
    public Caroserie(String caroserie, int nrUsi, boolean isNew){
        this.caroserie = caroserie;
        this.nrUsi = nrUsi;
        this.isNew = isNew;
    }
}
