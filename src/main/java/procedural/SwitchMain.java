package procedural;

public class SwitchMain {
    public static void main(String[] args) {
        getCar(MasiniEnum.AUDI);
    }

    public static void getCar(MasiniEnum masiniEnum) {
        switch (masiniEnum) {
            case BMW:
                System.out.println("Avem Bmw");
                break;
            case MERCEDES:
                System.out.println("Mercedes");
                break;
            default:
                System.out.println("Avem alta masina");
        }
    }

}
