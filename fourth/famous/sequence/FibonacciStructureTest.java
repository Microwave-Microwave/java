package famous.sequence;

import static check.CheckThat.Condition.FULLY_IMPLEMENTED;
import static check.CheckThat.Condition.USABLE_WITHOUT_INSTANCE;
import static check.CheckThat.Condition.VISIBLE_TO_ALL;

import org.junit.jupiter.api.Test;

import check.CheckThat;

public class FibonacciStructureTest {
//    @BeforeAll
//    public static void beforeAll() {
//        CheckThat.setLang("HU");
//    }

    @Test
    public void structure01() {
        CheckThat.theClass("famous.sequence.Fibonacci")
            .thatIs(VISIBLE_TO_ALL, FULLY_IMPLEMENTED)
            .hasMethodWithParams("fib", int.class)
                .thatIs(VISIBLE_TO_ALL, FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE)
                .thatReturns(int.class);
    }
}
