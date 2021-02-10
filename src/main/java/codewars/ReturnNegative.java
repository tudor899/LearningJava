package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnNegative {
    public static int makeNegative(int x) {
        if(x>0) {
            x = (-1) * x;
        }
        return x;
    }


    @Test
    public void test1() {
        assertEquals(-42, makeNegative(42));
    }
}

