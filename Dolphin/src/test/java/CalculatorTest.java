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

        int actual = calculator.Add("");


        assertEquals(0, actual, "Empty string");

    }

    @Test
    void testSingleInput() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("450");

        assertEquals(450, actual, "Empty string");

    }

    @Test
    void testIncludingNewLine() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("450,123,16\n124,152");

        assertEquals(865, actual, "Empty string");

    }

    @Test
    void testIncludingDelimiter() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("//s\n450s123s16\n124s152");

        assertEquals(865, actual, "Empty string");

    }

}