package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestId {
    public static int nextId(int[] ids) {
       for(int x = 0; x<ids.length; x++){
           return x;
       }
       return 0;
    }

    @Test
    public void fixedTests() {
        assertEquals(4, nextId(new int[] { 0, 1, 2, 3, 5 }));
        assertEquals(4, nextId(new int[] { 1, 2, 0, 2, 3 }));
        assertEquals(4, nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
        assertEquals(11, nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    }
}

