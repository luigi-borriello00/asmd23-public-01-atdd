file://<WORKSPACE>/src/test/java/calculator/CalculatorTest.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.1/scala3-library_3-3.3.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 120
uri: file://<WORKSPACE>/src/test/java/calculator/CalculatorTest.java
text:
```scala
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class @@CalculatorTest {

    @Test
    void acceptanceTest(){
        Calculator calculator = new Calculator();
        calculator.enter(5);
        assertEquals(5, calculator.getResult());

        calculator.enter(6);
        calculator.add();
        assertEquals(11, calculator.getResult());

        calculator.enter(3);
        calculator.add();
        assertEquals(14, calculator.getResult());
        assertEquals(14, calculator.getResult());

        calculator.enter(3);
        assertThrows(IllegalStateException.class, () -> calculator.enter(5));
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