package oop;

public class MainOOP {
    public static void main(String[] args){
        //declar un obiect casaGalbena, o instanta a unei clase
        Casa casaGalbena = new Casa(); //Casa() este constructor
        casaGalbena.hasGaraj = true;
        casaGalbena.nrFerestre = 9;
        casaGalbena.nrGeamuri =11;
        casaGalbena.nrUsi = 5;
        // am introdus proprietatile noii case
        Adresa adresaMea = new Adresa();
        adresaMea.nrCasa = 5;
        adresaMea.oras = "Mures";
        adresaMea.strada = "Progresului";

        casaGalbena.adresaMea = adresaMea;
        System.out.println("Adresa casei mele este "+ casaGalbena.adresaMea.strada + " " + casaGalbena.adresaMea.nrCasa + " " + casaGalbena.adresaMea.oras);

        Casa casaAlbastra = new Casa(5); //am folosit constructorul cu parametru
        int nrGeamuriDinObiect = casaAlbastra.nrGeamuri;
        Adresa adresa2 = new Adresa("Armoniei", "Cluj", 7);
        casaAlbastra.adresaMea = adresa2;
        System.out.println("Adresa casei 2 este " + casaAlbastra.adresaMea);

        System.out.println(nrGeamuriDinObiect);

        Casa casaRosie = new Casa(7,4);
        casaRosie.adresaMea = new Adresa("Viitorului", "Mures", 9);
        System.out.println("Nr usi= " + casaRosie.nrUsi + "\nNr ferestre= " + casaRosie.nrFerestre);

        Casa casaRoz = new Casa(3,4,5,false);
        System.out.println("Nr usi= " + casaRoz.nrUsi + "\nNr ferestre= " + casaRoz.nrFerestre + "\nNr geamuri= " + casaRoz.nrGeamuri + "\nAre garaj= " + casaRoz.hasGaraj);

        Casa casaMov = new Casa(7,8,9, true, 10);

        System.out.println("Numarul casei este " + casaMov.getNrCasa());
        casaMov.setNrCasa(19);
        System.out.println("Numarul casei este " + casaMov.getNrCasa());

    }
}
