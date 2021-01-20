package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cockroach {
    public int cockroachSpeed(double x){
        int cockroachSpeed = 0;
        cockroachSpeed = (int)(x/0.036);
        return cockroachSpeed;

    }
    @Test
    public void basicTests() throws Exception{
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}
