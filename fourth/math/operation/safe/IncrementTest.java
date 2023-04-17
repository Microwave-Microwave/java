package math.operation.safe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IncrementTest
{
    
    @ParameterizedTest
    @CsvSource({"0, 1", "-1, 0", "-2147483648, -2147483647", "2147483647, 2147483647", "678316, 678317", "-678316, -678315"})
    public void fibs(int n, int expected)
    {
        assertEquals(expected, Increment.increment(n));
    }
}