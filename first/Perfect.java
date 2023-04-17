class Perfect
{
    public static void main( String[] args)
    {
        int perfect_count = 0;
        for (int i = 1; i < Integer.parseInt(args[0]); i++)
        {
            int sum = 0;
            int number = i;

            for (int j = 1; j <= number/2; j++)
            {
                if (number % j == 0)
                {
                    sum += j;
                }
            }

            if (sum == number)
                perfect_count++;
        }

        if (perfect_count == 0)
            System.out.println("There are no perfect numbers in this range.");
        else
            System.out.println("There are " + perfect_count + " perfect numbers in this range.");

    }
}