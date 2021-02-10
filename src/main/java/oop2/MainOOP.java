package oop2;

public class MainOOP {
    public static void main(String[] args){

        Motor benzina = new MotorBenzina(7, 110);
        Masina masinaMea = new Masina(2011, 3000, 4,false, benzina);
        System.out.println("Masina mea are " + masinaMea.motor.caiPutere);
        /*System.out.println("Masina mea este fabricata in anul " + masinaMea.anulFabricatiei + " , are un pret de " + masinaMea.pret + " si are " +masinaMea.nrUsi + " usi.");
        Motor diesel = new Motor(false, 7, "diesel", 110);
        System.out.println("Are un motor " + diesel.tipCombustibil + " cu " + diesel.caiPutere + " cai putere.");
        Motor petrol = new Motor(true, 3, "petrol", 150);
        ProducatorModel opelAstra = new ProducatorModel("Opel", "Astra", 2011, 3000, false);
        System.out.println("Ea este produsa de " + opelAstra.producator + " ,modelul " + opelAstra.model + ".");
        ProducatorModel fordFocus = new ProducatorModel("Ford", "Focus", 2018, 7500, false);
        ProducatorModel daciaLogan = new ProducatorModel("Dacia", "logan");
        Caroserie combi = new Caroserie(true, "break", "gri");
        Caroserie hatchback = new Caroserie(false,"hatchback", "red");
        System.out.println("Caroseria este de tip " + hatchback.caroserie + " si culoarea este " + combi.culoare + ".");
        Caroserie suv = new Caroserie("SUV", 4, true);*/
    }
}
