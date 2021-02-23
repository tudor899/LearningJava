package oop2;

public class MainOOP {
    public static void main(String[] args){

        Motor motorina = new MotorDiesel(7, 220);
        Motor benzina = new MotorBenzina(7, 110);
        Masina masinaMea = new Masina(2011, 3000, 4,false, benzina);
        System.out.println("Masina mea are " + motorina.getCaiPutere());
        System.out.println("Masina mea este fabricata in anul " + masinaMea.getAnulFabricatiei() + " , are un pret de " + masinaMea.getPret() + " si are " +masinaMea.getNrUsi() + " usi.");
        MotorDiesel diesel = new MotorDiesel( 7,  110);
        System.out.println("Are un motor " + diesel.getTipCombustibil() + " cu " + diesel.getCaiPutere() + " cai putere.");
        ProducatorModel opelAstra = new ProducatorModel("Opel", "Astra", 2011, 3000, false);
        //System.out.println("Ea este produsa de " + opelAstra.setProducator("Opel"); + " ,modelul " + opelAstra.setModel("Astra"); + ".");
        ProducatorModel fordFocus = new ProducatorModel("Ford", "Focus", 2018, 7500, false);
        ProducatorModel daciaLogan = new ProducatorModel("Dacia", "logan");
        Caroserie combi = new Caroserie(true, "break", "gri");
        Caroserie hatchback = new Caroserie(false,"hatchback", "red");
        System.out.println("Caroseria este de tip " + hatchback.getCaroserie() + " si culoarea este " + combi.getCuloare() + ".");
        Caroserie suv = new Caroserie("SUV", 4, true);
    }
}
