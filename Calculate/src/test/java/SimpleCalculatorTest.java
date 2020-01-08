import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    Calculator calculator;
    int actual;


    @Before
    public void before(){
        calculator = new Calculator();
    }

    @After
    public void after(){
        actual = 0;
    }

    @Given("^that a is (\\d+) and b is (\\d+)$")
    public void adding(int arg0, int arg1) throws NegativeInputExpception {

        actual = calculator.Add(arg0 + "," + arg1);
    }


    @Given("^that a is (\\d+), b is (\\d+), c is (\\d+), d is (\\d+) and e is (\\d+)$")
    public void thatAIsBIsCIsDIsAndEIs(int arg0, int arg1, int arg2, int arg3, int arg4) throws NegativeInputExpception {

        actual = calculator.Add(arg0 + "," + arg1 + "," + arg2 + "," + arg3 + "," + arg4);
    }


    @Given("^that a is empty$")
    public void thatAIsEmpty() throws NegativeInputExpception {
        actual = calculator.Add("");
    }

    @Given("^that a is (\\d+)$")
    public void thatAIs(int arg0) throws NegativeInputExpception {
        actual = calculator.Add(arg0+"");
    }



    @Given("^that a is (\\d+), b is (\\d+), c is \"([^\"]*)\", d is (\\d+)$")
    public void thatAIsBIsCIsDIs(int arg0, int arg1, String arg2, int arg3) throws NegativeInputExpception {
        actual = calculator.Add(arg0 + "," + arg1 + arg2 + arg3);
    }


    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int arg0) {
        assertEquals("The result is ", arg0, actual);
    }
}
