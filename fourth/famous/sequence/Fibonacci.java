package famous.sequence;

public class Fibonacci
{
    public static int fib(int n)
    {
        return n == 0 ? 0 : ( n == 1 ? 1 : fib (n-1) + fib(n-2));
    }
}