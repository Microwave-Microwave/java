package famous.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangularNumbersTest
{
    @Test
    public void fib0()
    {
        assertEquals(0, TriangularNumbers.getTriangularNumber(0));
    }
    @Test
    public void fib1()
    {
        assertEquals(1, TriangularNumbers.getTriangularNumber(1));
    }
    @Test
    public void fib2()
    {
        assertEquals(5050, TriangularNumbers.getTriangularNumber(100));
    }
    @Test
    public void fib3()
    {
        assertEquals(-1, TriangularNumbers.getTriangularNumber(-1));
    }
    @Test
    public void fib4()
    {
        assertEquals(-1, TriangularNumbers.getTriangularNumber(-100));
    }
}