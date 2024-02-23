package calculator;

import io.cucumber.java.en.*;

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
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @When("I subtract {int} from {int}")
    public void iSubtractNumberFromNumber(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the difference should be {int}")
    public void theDifferenceShouldBeDifference(int result) {
        this.calculator.subtract();
        if (result != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }


    @And("I press the multiply button")
    public void iPressTheMultiplyButton() {
        this.calculator.multiply();
    }


    @Then("the result should be {int} on the screen")
    public void theResultShouldBeResultOnTheScreen(int result) {
        if (result != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @And("I press the number {int}")
    public void iPressTheNumberNumber(int arg0) {

    }

    @When("I add {int} and {int}")
    public void iAddArgAndArg(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

}
