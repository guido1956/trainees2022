import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    @Test
    public void addTwoPositiveNumbers() {
        int number1 = 25;
        int number2 = 30;
        int expectedResult = 55;
        int actualResult = Arithmetic.add(number1, number2);
        assertEquals(expectedResult, actualResult, "Adding two positive numbers not correct");
    }

}


