import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {

    Calculator calculator;
    int actual;


    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Given("^that a is (\\d+) and b is (\\d+)$")
    public void adding(int arg0, int arg1) {

        actual = calculator.Add(arg0 + "," + arg1);
    }


    @Then("^c should be (\\d+)$")
    public void result(int arg0) {
        assertEquals("The result is ", arg0, actual);
    }




}
