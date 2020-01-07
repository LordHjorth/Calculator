import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {

        Calculator calculator = new Calculator();

        int actual = calculator.Add("20,20,1,51,23,51");

        assertEquals(166, actual, "Adding");

    }

    @Test
    void testEmptyString() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("1");


        assertEquals(0, actual, "Empty string");

    }

    @Test
    void testSingleInput() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("450");

        assertEquals(450, actual, "Empty string");

    }

}