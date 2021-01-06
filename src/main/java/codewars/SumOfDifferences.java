package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDifferences {
    public static void main(String[] args) {

    }

    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        if (arr.length < 2) {
            return 0;
        } else {
            for (int x = arr.length - 1; x > 0; x--) {
                sum += arr[x] - arr[x - 1];

            }
        }
        return sum;

    }


    @Test
    public void basicTests() {
        assertEquals(9, sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, sumOfDifferences(new int[0]));
        assertEquals(0, sumOfDifferences(new int[]{0}));
        assertEquals(0, sumOfDifferences(new int[]{-1}));
        assertEquals(0, sumOfDifferences(new int[]{1}));
    }

    @Test
    public void randomTest(){
        int[] arr = {7, 3, 2, 5, 7, 3, 5, 5, 10, 8, 3, 9, 10, 4, 9, 1, 10, 0, 4, 1, 8, 2, 4, 9, 7, 9};
        assertEquals(10, sumOfDifferences(arr));

    }
}