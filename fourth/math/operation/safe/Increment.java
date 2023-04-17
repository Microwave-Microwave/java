package math.operation.safe;

public class Increment
{
    public static void main( String[] args)
    {
        System.out.printf("meow: %d \n", increment(2147483647));
    }
    public static int increment(int n)
    {
        return n == 2147483647 ? n : n+1;
    }
}