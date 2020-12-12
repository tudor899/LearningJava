package strings;

public class StringManipulation {
    public static void main(String[] args) {

        String str = " Lore ipsum lofim sma ma sa";
        String result = everySecondCharacter(str);
        System.out.println(result);

    }

    public static String everySecondCharacter(String st) {
        int len = st.length();
        String newSt = "";

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                newSt += st.charAt(i);
            }
        }

        return newSt;
    }
}
