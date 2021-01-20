package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfPositive {


    public static int sum(int[] arr) {
        int sum = 0;
        for (int x = 0; x <= arr.length - 1; x++) {
            if (arr[x] > 0) {
                sum += arr[x];
            }
        }
        return sum;
    }


    @Test
    public void testSomething() {
        assertEquals(15, SumOfPositive.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, SumOfPositive.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, SumOfPositive.sum(new int[]{}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, SumOfPositive.sum(new int[]{-1, 2, 3, 4, -5}));
    }
}

