package oop2;

public class MotorBenzina extends Motor {

    public MotorBenzina(){

    }
    public MotorBenzina(int consum, int caiPutere){
        super(consum, caiPutere);
        setTipCombustibil(TipCombustibil.BENZINA);

    }

}
