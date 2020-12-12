package codewars;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };

        int[] myArr2 = new int[]{ 10, 9, 8 };

        myArr[1] = myArr2;

        System.out.println(myArr[1][2]);
    }
}
