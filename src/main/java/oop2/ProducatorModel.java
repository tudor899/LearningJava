package oop2;

public class ProducatorModel extends Masina {
    String producator;
    String model;


    public ProducatorModel() {
    }

    public ProducatorModel(String producator, String model) {
        producator = this.producator;
        model = this.model;
    }

    public ProducatorModel(String producator, String model, int anulFabricatiei, int pret, boolean isNew) {
        this.producator = producator;
        this.model = model;
        this.anulFabricatiei = anulFabricatiei;
        this.pret = pret;
        this.isNew = isNew;
    }

}
