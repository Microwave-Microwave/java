package famous.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest
{
    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "9, 34"})
    public void fibs(int n, int expected)
    {
        assertEquals(expected, Fibonacci.fib(n) );
    }

    @Test
    public void fib0()
    {
        assertEquals(0, Fibonacci.fib(0) );
    }
    @Test
    public void fib1()
    {
        assertEquals(1, Fibonacci.fib(1) );
    }
    @Test
    public void fib2()
    {
        assertEquals(1, Fibonacci.fib(2) );
    }
    @Test
    public void fib3()
    {
        assertEquals(2, Fibonacci.fib(3) );
    }
}