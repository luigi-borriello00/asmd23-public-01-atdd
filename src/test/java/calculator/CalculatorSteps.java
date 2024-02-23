package calculator;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }


    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        assertEquals(arg0, this.calculator.getResult());
    }

    @When("I subtract {int} from {int}")
    public void iSubtractNumberFromNumber(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the difference should be {int}")
    public void theDifferenceShouldBeDifference(int result) {
        this.calculator.subtract();
        assertEquals(result, this.calculator.getResult());
    }


    @And("I press the multiply button")
    public void iPressTheMultiplyButton() {
        this.calculator.multiply();
    }


    @Then("the result should be {int} on the screen")
    public void theResultShouldBeResultOnTheScreen(int result) {
        assertEquals(result, this.calculator.getResult());
    }

    @And("I press the number {int}")
    public void iPressTheNumberNumber(int arg0) {
        this.calculator.enter(arg0);
    }

    @When("I add {int} and {int}")
    public void iAddArgAndArg(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @When("I divide {int} by {int}")
    public void iDivideBy(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int result) {
        this.calculator.divide();
        assertEquals(result, this.calculator.getResult());
    }

    @Then("the operation should fail")
    public void theOperationShouldFail() {
        assertThrows(ArithmeticException.class, () -> {
            this.calculator.divide();
        });

    }
}
