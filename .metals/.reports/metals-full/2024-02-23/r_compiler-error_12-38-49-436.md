file://<WORKSPACE>/src/test/java/calculator/CalculatorSteps.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.1/scala3-library_3-3.3.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 1355
uri: file://<WORKSPACE>/src/test/java/calculator/CalculatorSteps.java
text:
```scala
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
            throw new IllegalSta@@teException();
        }
    }

    @When("I add {int} and {int}")
    public void I_add_and(int i, int i2) {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I press the number {int}")
    public void iPressTheNumberNumber(int arg0) {
        
    }

   

}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:352)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator