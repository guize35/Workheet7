import org.example.Number;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void testIsPrime(int number) {
        assertTrue(Number.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void testIsEven(int number) {
        assertTrue(Number.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void testIsNotEven(int number) {
        assertFalse(Number.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    public void testIsMultipleOf23(int number) {
        assertTrue(Number.isMultiple(number, 23));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 32, 64, 2, 20, 30, 26})
    public void testIsNotMultipleOf23(int number) {
        assertFalse(Number.isMultiple(number, 23));
    }

}
