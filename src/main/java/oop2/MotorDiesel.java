package oop2;

public class MotorDiesel extends Motor {

    public MotorDiesel() {

    }

    public MotorDiesel(int consum, int caiPutere) {
       super(consum, caiPutere);
        setTipCombustibil(TipCombustibil.DIESEL);
    }
}
