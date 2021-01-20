package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharProblem {
    public static int howOld(final String herOld) {

        //your code here, return correct age as int ; )
        String[] yearsOld = herOld.split(" ");
        int howOld = Integer.parseInt(yearsOld[0]);
        System.out.println(yearsOld[1]);
        return howOld;
    }

    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }
}
