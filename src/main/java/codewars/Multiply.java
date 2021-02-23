package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Multiply {
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }


    @Test
    public void sampleTest() {
        assertEquals(4, multiply(2, 2));
        assertEquals(10, multiply(5, 2));
        assertEquals(100, multiply(100, 1));
        assertEquals(0, multiply(0, 1000));
    }
}

