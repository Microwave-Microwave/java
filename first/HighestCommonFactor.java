class HighestCommonFactor
{
    public static void main( String[] args)
    {
        long lcf = 1;

        for (long i = 2; i <= Long.parseLong(args[0]); i++)
        {
            boolean is_common_factor = true;
            for (int j = 0; j < args.length; j++)
            {
                if (i == Long.parseLong(args[j]))
                {
                    System.out.println("Highest common factor: " + lcf);
                    return;
                }


                
            }

            if (is_common_factor)
                lcf = i;
        }

        System.out.println("Highest common factor: " + lcf);
        System.out.println("array length: " + args.length);
        
    }
}