import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator calculator = new Calculator();

        int actual = calculator.Add("20,20,1,51,23,51");

        assertEquals(166, actual);

    }

    @Test
    public void testEmptyString() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("");


        assertEquals(0, actual);

    }

    @Test
    public void testSingleInput() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("450");

        assertEquals(450, actual);

    }

    @Test
    public void testIncludingNewLine() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("450,123,16\n124,152");

        assertEquals(865, actual);

    }

    @Test
    public void testIncludingDelimiter() {
        Calculator calculator = new Calculator();

        int actual = calculator.Add("//s\n450s123s16\n124s152");

        assertEquals(865, actual);

    }

}