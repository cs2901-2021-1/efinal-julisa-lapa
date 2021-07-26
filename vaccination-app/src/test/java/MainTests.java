import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
class MainTests {

    @RepeatedTest(value = 1000)
    void test01() {
        long maxExecutionTime = 400;
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        Assertions.assertEquals(false, executionTime >= maxExecutionTime);
    }

}
