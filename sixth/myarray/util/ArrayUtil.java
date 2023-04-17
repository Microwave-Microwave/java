package myarray.util;

public class ArrayUtil
{
    public ArrayUtil()
    {
        return;
    }

    

    public static int max(int[] array)
    {
        int max = Integer.MIN_VALUE;

        if (array.length == 0)
            return 0;

        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
                max = array[i];
        }

        return max;
    }

    public static int max2(int[] array)
    {
        int max = Integer.MIN_VALUE;

        if (array.length == 0)
            return 0;

        for (int i = 0; i < array.length; i++)
            max = array[i] > max ? array[i] : max;

        return max;
    }

    public static int max3(int[] array)
    {
        int max = Integer.MIN_VALUE;

        if (array.length == 0)
            return 0;

        for (int i = 0; i < array.length; i++)
            max =  Math.max(array[i], max) == array[i] ? array[i] : max;

        return max;
    }

    public static int max4(int[] array)
    {
        int max = Integer.MIN_VALUE;

        if (array.length == 0)
            return 0;

        for (int n : array)
            if (max < n)
                max = n;

        return max;
    }

    public static int[] minMax(int[] array)
    {
        int[] min_max = {Integer.MIN_VALUE, Integer.MAX_VALUE};

        if (array.length == 0)
            return new int[]{0, 0};
        if (array.length == 1)
        {
            if (array[0] > array[1])
                 return new int[]{array[1], array[0]};
            else
                 return new int[]{array[0], array[1]};
        }

        for (int i = 0; i < array.length; i++)
        {
            if (min_max[0] < array[i])
                min_max[0] = array[i];
            if (min_max[1] > array[i])
                min_max[1] = array[i];
        }
        return min_max;
    }
}