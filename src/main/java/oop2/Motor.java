package oop2;

public class Motor {
    int consum;
    String tipCombustibil;
    int caiPutere;

    public Motor() {

    }

    public Motor(boolean isHybrid, int consum, String tipCombustibil, int caiPutere) {

        this.consum = consum;
        this.tipCombustibil = tipCombustibil;
        this.caiPutere = caiPutere;

    }

}