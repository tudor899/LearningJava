package codewars;

public class MultiplicationTable {
    static String multiTable(int num){
        return  "1 * " + num + " = " + 1 * num + "\n" +
                "2 * " + num + " = " + 2 * num + "\n" +
                "3 * " + num + " = " + 3 * num + "\n" +
                "4 * " + num + " = " + 4 * num + "\n" +
                "5 * " + num + " = " + 5 * num + "\n" +
                "6 * " + num + " = " + 6 * num + "\n" +
                "7 * " + num + " = " + 7 * num + "\n" +
                "8 * " + num + " = " + 8 * num + "\n" +
                "9 * " + num + " = " + 9 * num + "\n" +
                "10 * " + num + " = " + 10 * num + "\n";

    }
    static String multiTable2(int num){
        String rezultat = "";
        for (int i = 1; i <11; i++){
            rezultat = rezultat + i +" * " + num + " = " + i * num + "\n";
        }
        return rezultat.trim();
    }
    public static void main(String[] args) {
        String cinci = multiTable(5);
        System.out.println(cinci);



    }
}
