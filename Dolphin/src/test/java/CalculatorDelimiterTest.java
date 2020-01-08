import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CalculatorDelimiterTest {


    Calculator calculator;
    int actual;


    @Before
    public void before() {
        calculator = new Calculator();
    }


    @Given("^that the delimiter is \"([^\"]*)\" and a is (\\d+) and b is (\\d+)$")
    public void thatTheDelimiterIsAndAIsAndBIs(String arg0, int arg1, int arg2) {
        actual = calculator.Add("//" + arg0 + "\n" + arg1 + arg0 + arg2);
    }

    @Then("^d should be (\\d+)$")
    public void cShouldBe(int arg0) {
        assertEquals("Test", arg0, actual);
    }

}
