package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanToString {
    public static String convert(boolean b) {
       // String str = String.valueOf(b);

        if (b) {
            return "true";
        } else {
            return "false";
        }
    }
    @Test
    public void testTrue(){
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(BooleanToString.convert(false), "false");
    }

    public static void main(String[] args){
        System.out.println(BooleanToString.convert(true));
    }
}