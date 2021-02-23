package oop2;

public class ProducatorModel extends Masina {
    private String producator;
    private String model;


    public ProducatorModel() {
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ProducatorModel(String producator, String model) {
       setProducator(producator);
       setModel(model);
    }

    public ProducatorModel(String producator, String model, int anulFabricatiei, int pret, boolean isNew) {
        setProducator(producator);
        setModel(model);
        getAnulFabricatiei();
        getPret();
        getIsNew();
    }

}
