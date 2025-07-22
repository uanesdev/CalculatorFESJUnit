import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testDivision() {
        assertEquals(5, calculator.division(10, 2));
        assertThrows(ArithmeticException.class, () -> calculator.division(10, 0));
    }

    @Test
    void testIsDivisionByZero() {
        assertTrue(calculator.isDivisionByZero(5));
        // assertTrue(calculator.isDivisionByZero(0)); Simula um erro! {Expected: true, Actual: false}
        assertFalse(calculator.isDivisionByZero(0));
    }

    @Test
    void testSum() {
        assertEquals(4, calculator.sum(2, 2));
        assertEquals(0, calculator.sum(-1, 1));
        assertEquals(-2, calculator.sum(-1, -1));
    }

    @Test
    void testIsPositivesNums() {
        assertTrue(calculator.isPositivesNums(1, 1));
        assertFalse(calculator.isPositivesNums(-1, 1));
        assertFalse(calculator.isPositivesNums(1, -1));
    }

    @Test
    void testIsNegativesNums() {
        assertTrue(calculator.isNegativesNums(-1, -1));
        assertFalse(calculator.isNegativesNums(-1, 1));
        assertFalse(calculator.isNegativesNums(1, 1));
    }
}