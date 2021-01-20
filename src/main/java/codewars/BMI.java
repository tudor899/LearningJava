package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * /*if bmi <= 18.5 return "Underweight"
 * <p>
 * if bmi <= 25.0 return "Normal"
 * <p>
 * if bmi <= 30.0 return "Overweight"
 * <p>
 * if bmi > 30 return "Obese"
 */

public class BMI {
    public static String bmi(double weight, double height) {
        double bodyMass = weight / (height * height);
        if (bodyMass <= 18.5) {
            return "Underweight";
        } else if (bodyMass <= 25.0) {
            return "Normal";
        } else if (bodyMass <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }


    }


    @Test
    public void testBMI() {
        assertEquals("Normal", bmi(80, 1.80));
    }
}

