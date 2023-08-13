package br.com.devmpoda.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    void test_two_positive_numbers() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 8.2D;

        Double result = math.sum(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_sum_positive_and_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = -2D;
        Double expected = 4.2D;

        Double result = math.sum(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_sum_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = -6.2D;
        double secondNumber = -2D;
        Double expected = -8.2D;

        Double result = math.sum(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_sub_positive_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 4.2D;

        Double result = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_sub_positive_and_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = -2D;
        Double expected = 8.2D;

        Double result = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_sub_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = -6.2D;
        double secondNumber = -2D;
        Double expected = -4.2D;

        Double result = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_mult_positive_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 2D;
        double secondNumber = 2D;
        Double expected = 4D;

        Double result = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_mult_positive_and_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 2D;
        double secondNumber = -2D;
        Double expected = -4D;

        Double result = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_mult_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = -2D;
        double secondNumber = -2D;
        Double expected = 4D;

        Double result = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_div_positive_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 2D;
        Double expected = 2D;

        Double result = math.division(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_div_positive_and_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = -2D;
        Double expected = -2D;

        Double result = math.division(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_div_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = -4D;
        double secondNumber = -2D;
        Double expected = 2D;

        Double result = math.division(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_mean_positive_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 8D;
        Double expected = 6D;

        Double result = math.mean(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_mean_positive_and_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = -8D;
        Double expected = -2D;

        Double result = math.mean(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_mean_negative_number(){
        SimpleMath math = new SimpleMath();
        double firstNumber = -4D;
        double secondNumber = -8D;
        Double expected = -6D;

        Double result = math.mean(firstNumber, secondNumber);

        assertEquals(expected, result, () -> String.format("%s+%s did not produce %s!",
                firstNumber, secondNumber, expected));
    }

    @Test
    void test_square_positive_number(){
        SimpleMath math = new SimpleMath();
        double squareNumber = 9D;
        Double expected = 3D;

        Double result = math.squareRoot(squareNumber);

        assertEquals(expected, result, () -> String.format("Square(%s) did not produce %s!",
                squareNumber,expected));
    }

    @Test
    void test_square_decimal_positive_number(){
        SimpleMath math = new SimpleMath();
        double squareNumber = 1.44D;
        Double expected = 1.2D;

        Double result = math.squareRoot(squareNumber);

        assertEquals(expected, result, () -> String.format("Square(%s) did not produce %s!",
                squareNumber,expected));
    }

    @Test
    void test_square_negative_number(){
        SimpleMath math = new SimpleMath();
        double squareNumber = -9D;

        Double result = math.squareRoot(squareNumber);

        assertTrue(result.isNaN());
    }

}
