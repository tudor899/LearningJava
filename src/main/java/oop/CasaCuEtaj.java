package oop;

public class CasaCuEtaj extends Casa implements Interfata{
    int nrEtaje;

    public CasaCuEtaj(){

    }
    public CasaCuEtaj(int nrEtaje){ this.nrEtaje = nrEtaje;

    }
    public CasaCuEtaj(int nrGeamuri, int nrUsi, int nrFerestre, boolean hasGaraj, Adresa adresa, int nrCasa, int nrEtaje){
        this.nrGeamuri = nrGeamuri;
        this.nrUsi = nrUsi;
        this.nrFerestre = nrFerestre;
        this.hasGaraj = hasGaraj;
        adresaMea= adresa;
        setNrCasa(nrCasa);
        this.nrEtaje = nrEtaje;

    }
    public CasaCuEtaj(boolean hasGaraj, int nrUsi){
        super(hasGaraj, nrUsi);
    }

    @Override
    public void deschideUsa() {

    }
}

