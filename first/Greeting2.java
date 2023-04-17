class Greeting2
{
    public static void main( String[] args)
    {
        long start = System.currentTimeMillis();

        if (args.length != 1)
        {
            System.err.println("ERROR: Incorrect number or command line arguments!");
            System.exit(1);
        }
        else
        {
            System.out.println("Hello " + args[0] + "!");
        }
        
        System.out.println("Test");
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

        System.out.println("Execution time: " + elapsedTime + "ms");
    }
}