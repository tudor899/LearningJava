package teme;

public class Teme {

    static double euler = 2.718281828459045235;
    static double pi = 3.14159265359;
    static double acceleratiaGravitationalea = 9.80665;

    public static int performOperation(int a, int b, TipOperatie tipOperatie){
        if(tipOperatie.equals(TipOperatie.ADUNARE)){
            return a + b;
        }else if(tipOperatie.equals(TipOperatie.SCADERE)){
            return a - b;
        }else if(tipOperatie.equals(TipOperatie.INMULTIRE)){
            return a * b;
        }else if(tipOperatie.equals(TipOperatie.IMPARTIRE)){
            return a / b;
        }
    return 0;}}


/*   1. Declarati mai multe variabile statice (constante  - numarul lui euler, pi, acceleatia gravitatonala)
        2. Creaza o metoda care primeste un enum de tip operatii (adunare, scadere, inmultire, impartire)

        public static int performOperation(int a, int b, TipOperatie operatie){

            if(operatie == TipOperatie.ADUNARE){
                return a + b;

             } else ... pentru restul
        }

        3. Modifica toate clasele sa respecte encapsularea
        4. O problema pe Codewars
    *//*


}
*/
