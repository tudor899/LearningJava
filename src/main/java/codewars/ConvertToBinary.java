package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToBinary {
    public static int toBinary(int n) {
        int rezultat = Integer.parseInt(Integer.toBinaryString(n));
        return rezultat;
    }



    @Test
    public void testToBinary() {
        assertEquals(1, toBinary(1));
        assertEquals(10, toBinary(2));
        assertEquals(11, toBinary(3));
        assertEquals(101, toBinary(5));
    }
}