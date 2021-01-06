package codewars;

public class AlphabetPosition {
    public static void main(String[] arg) {
        String literaA = position('l');
        System.out.println(literaA);
    }

    public static String position(char alphabet) {
        return "" + ((int)alphabet -96);
    }
}
