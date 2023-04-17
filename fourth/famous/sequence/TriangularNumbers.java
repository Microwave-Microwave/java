package famous.sequence;

public class TriangularNumbers
{
    public static void main( String[] args)
    {
        System.out.printf("meow: %d \n", getTriangularNumber(-10));
    }
    public static int getTriangularNumber(int n)
    {
        return n < 0 ? -1 : n == 0 ? 0 : ( n == 1 ? 1 : n + getTriangularNumber(n-1));
    }
    public static int getTriangularNumberAlternative(int n)
    {
        return n < 0 ? -1 : n == 0 ? 0 : ( n == 1 ? 1 : n + getTriangularNumber(n-1));
    }
    
}