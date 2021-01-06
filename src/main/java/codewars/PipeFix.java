package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PipeFix {
    public static void main(String[] args) {
    }

    public static int[] pipeFix(int[] numbers) {
        int primulElement = numbers[0];
        int ultimulElement = numbers[numbers.length - 1];
        int lungime = ultimulElement - primulElement + 1;
        int[] arrayDeNumere = new int[lungime];
        int a = numbers[0];
        for (int i = 0; i < arrayDeNumere.length; i++) {
            arrayDeNumere[i] = a + i;
        }
        return arrayDeNumere;
    }


    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, pipeFix(new int[]{1, 2, 3, 12}));
        assertArrayEquals(new int[]{6, 7, 8, 9}, pipeFix(new int[]{6, 9}));
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, pipeFix(new int[]{-1, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, pipeFix(new int[]{1, 2, 3}));
    }
}