package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Clock {
    public static int Past(int h, int m, int s) {
            return h * 3600000 + m * 60000 + s * 1000;
        }


    @Test
    public void test1() {

        assertEquals(61000, Clock.Past(0, 1, 1));
    }
}