package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        Integer x = null;
        for (int y = 0; y < array.length - 1; y++) {
            if (array[y + 1] != array[y] + 1) {
                x = array[y + 1];
               break;
            }
        }
        return x;
    }


    @Test
    public void basicTests() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, FirstNonConsecutive.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    }
}


