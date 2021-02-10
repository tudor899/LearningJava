package oop;

import java.util.Objects;

public class Casa {
    //proprietati atribute fielduri
    int nrGeamuri;
    int nrUsi;
    int nrFerestre;
    boolean hasGaraj;
    Adresa adresaMea;
    private int nrCasa;

    // constructorul default
    public Casa(){

    }
    //daca nu folosesc default gol, acesta exista deja si este suprascris de cel nou
    public Casa(int geamuri){
        nrGeamuri = geamuri;
    }

    public Casa(boolean hasGaraj){
        this.hasGaraj = hasGaraj;
    }
    public Casa(int usi, int ferestre){
        nrUsi = usi;
       nrFerestre = ferestre;
    }
    public Casa(int geamuri, int usi, int ferestre, boolean garaj){
        nrUsi = usi;
        nrGeamuri = geamuri;
        hasGaraj = garaj;
        nrFerestre = ferestre;
    }
    public Casa(int geamuri, int usi, int ferestre, boolean garaj, int nrCasa){
        nrUsi = usi;
        nrGeamuri = geamuri;
        hasGaraj = garaj;
        nrFerestre = ferestre;
        //daca au acelasi nume trebuie sa folosesc this
        this.nrCasa = nrCasa;
    }

    public Casa(boolean garaj, int usi){
        this(usi);
        hasGaraj = garaj;
    }
    public int getNrCasa(){
        return nrCasa;
    }
    public void setNrCasa(int nrCasa){
        this.nrCasa = nrCasa;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return nrGeamuri == casa.nrGeamuri;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrGeamuri);
    }
}
