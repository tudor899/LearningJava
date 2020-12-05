package procedural;

//4. Creaza un switch case cu un Enum in main
//e.g. Sa printeze ce tip de animal avem (enum are o lista definita)
public class TemaEnum {
    public static void main(String[] args) {

    }

    void printAnimal(Animale enumAnimale) {
        switch (enumAnimale) {
            case CAINE:
                System.out.println("Acesta este un caine");
                break;
            case PISICA:
                System.out.println("Aceasta este o pisica");
                break;
            case LEU:
                System.out.println("Acesta este un leu");
            default:
                System.out.println("Acesta este un alt animal");
        }
    }
}

enum Animale {
    CAINE,
    PISICA,
    LEU,
    TIGRU,
    LEOPARD
}