package oop;

public class MainOOP2 {
    public static void main(String[] args){
        String a = "maro";
        String b = "maro";
        String c = new String("maro");
        /*System.out.println(a.equals(c));
        System.out.println(a==b);*/
        Casa casa1 = new Casa(7);
        Casa casa2 = new Casa(7);
        System.out.println(casa1==casa2);
        System.out.println(casa1.equals(casa2));
        CasaCuEtaj casaCuTreiEtaje = new CasaCuEtaj();
        casaCuTreiEtaje.nrEtaje = 3;
        casaCuTreiEtaje.hasGaraj = true;
        casaCuTreiEtaje.nrFerestre = 11;
        casaCuTreiEtaje.nrGeamuri =14;
        casaCuTreiEtaje.nrUsi = 7;
        casaCuTreiEtaje.setNrCasa(56);
        casaCuTreiEtaje.adresaMea = new Adresa("Principala", "Mures", 9);
    }




}
