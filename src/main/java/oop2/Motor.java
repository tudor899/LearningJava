package oop2;

public class Motor {
    int consum;
    TipCombustibil tipCombustibil;
    int caiPutere;

    public Motor() {

    }

    public Motor(boolean isHybrid, int consum, TipCombustibil tipCombustibil, int caiPutere) {
        this.consum = consum;
        this.tipCombustibil = tipCombustibil;
        this.caiPutere = caiPutere;
    }

}