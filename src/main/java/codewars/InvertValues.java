package codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertValues {
    public static int[] invert(int[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = (-1) * array[x];
        }
        return array;
    }

    @Test
    public void testSomething() {

        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(invert(input)));

        input = new int[]{-1, 2, -3, 4, -5};
        expected = new int[]{1, -2, 3, -4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(invert(input)));

        input = new int[]{};
        expected = new int[]{};
        assertEquals(Arrays.toString(expected), Arrays.toString(invert(input)));

        input = new int[]{0};
        expected = new int[]{0};
        assertEquals(Arrays.toString(expected), Arrays.toString(invert(input)));
    }
}



