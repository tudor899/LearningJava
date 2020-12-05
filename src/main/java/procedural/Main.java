package procedural;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int z;

        // y = 7, x = 8
        z = x; // bolul suplimentar : punem sarea
        x = y; // punem piperul in bolul in care era sare (pt ca e gol)
        y = z;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

    }
}
