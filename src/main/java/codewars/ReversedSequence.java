package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReversedSequence {
    public static int[] reverse(int n) {
        int[] reverse = new int[n];
        for (int i = 0; i < n; i++) {

            reverse[i] = n-i;
        }
        return reverse;
    }

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverse(5));
    }
}
