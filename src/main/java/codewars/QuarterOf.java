package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuarterOf {
    public static int quarterOf(int month) {
        int quarter = 0;
        if(month>=1 && month <=3){
            quarter = 1;
        }else if(month>=4 && month <=6){
            quarter = 2;
        }else if(month>=7 && month <=9){
            quarter = 3;
        }else if(month>=10 && month <=12){
            quarter = 4;
        }
        return quarter;
    }
    @Test
    public void exampleTests() {
        assertEquals(1, quarterOf(3));
        assertEquals(3, quarterOf(8));
        assertEquals(4, quarterOf(11));
    }
}


