package oop2;

public class Motor {
    private int consum;
    private TipCombustibil tipCombustibil;
    private int caiPutere;

    public Motor() {

    }
    public Motor(int consum, TipCombustibil tipCombustibil, int caiPutere) {
        this.consum = consum;
        this.tipCombustibil = tipCombustibil;
        this.caiPutere = caiPutere;
    }
    public Motor(int consum, int caiPutere) {
        this.consum = consum;
        this.caiPutere = caiPutere;
    }
    public int getConsum(){return consum;}
    public int getCaiPutere(){return caiPutere;}
    public TipCombustibil getTipCombustibil() {
        return tipCombustibil;
    }
    public void setConsum(int consum){
        this.consum = consum;
    }
    public void setCaiPutere(int caiPutere){
        this.caiPutere = caiPutere;
    }
    public void setTipCombustibil(TipCombustibil tipCombustibil){
        this.tipCombustibil = tipCombustibil;
    }


}