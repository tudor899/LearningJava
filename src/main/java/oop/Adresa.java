package oop;

public class Adresa {
    String strada;
    String oras;
    int nrCasa;

    public Adresa(String strada, String oras, int nrCasa){
        this.strada = strada;
        this.oras = oras;
        this.nrCasa = nrCasa;
    }
    public Adresa(){

    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", oras='" + oras + '\'' +
                ", nrCasa=" + nrCasa +
                '}';
    }
}
