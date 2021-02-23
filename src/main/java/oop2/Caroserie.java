package oop2;

public class Caroserie extends Masina {
    private boolean esteMasinaDeFamilie;
    private String caroserie;
    private String culoare;


    public Caroserie(){
    }

    public boolean getEsteMasinaDeFamilie() {return esteMasinaDeFamilie;};
    public String getCaroserie(){return caroserie;}
    public String getCuloare(){return culoare;}
    public Caroserie(boolean esteMasinaDeFamilie, String caroserie, String culoare){
        this.esteMasinaDeFamilie = esteMasinaDeFamilie;
        this.caroserie = caroserie;
        this.culoare = culoare;
    }

    public Caroserie(String caroserie, int nrUsi, boolean isNew){
        this.caroserie = caroserie;
        setNrUsi(nrUsi);
        setIsNew(isNew);
    }
}
