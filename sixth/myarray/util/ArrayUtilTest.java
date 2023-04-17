package myarray.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArrayUtilTest
{
    
    @Test
    public void maxLength0()
    {
        int[] array = {};
        assertEquals(0, ArrayUtil.max(array));
        assertEquals(0, ArrayUtil.max2(array));
        assertEquals(0, ArrayUtil.max3(array));
        assertEquals(0, ArrayUtil.max4(array));
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "-1232732, -1232732", "79843792, 79843792"})
    public void maxLength1(int n, int expected)
    {
        int[] array = {n};
        assertEquals(expected, ArrayUtil.max(array));
        assertEquals(expected, ArrayUtil.max2(array));
        assertEquals(expected, ArrayUtil.max3(array));
        assertEquals(expected, ArrayUtil.max4(array));
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "-1232732, -1232732", "79843792, 79843792"})
    public void maxLength2(int min, int max)
    {
        int[] array1 = {min, max};
        int[] array2 = {max, min};

        assertEquals(max, ArrayUtil.max(array1));
        assertEquals(max, ArrayUtil.max2(array1));
        assertEquals(max, ArrayUtil.max3(array1));
        assertEquals(max, ArrayUtil.max4(array1));

        assertEquals(max, ArrayUtil.max(array2));
        assertEquals(max, ArrayUtil.max2(array2));
        assertEquals(max, ArrayUtil.max3(array2));
        assertEquals(max, ArrayUtil.max4(array2));
    }

    @Test
    public void minMaxLength0()
    {
        assertEquals(new int[]{0, 0}, ArrayUtil.minMax(new int[]{}));
    }
    @Test
    public void minMaxLength1()
    {
        assertEquals(new int[]{54, 54}, ArrayUtil.minMax(new int[]{54}));
    }
    @Test
    public void minMaxLength2()
    {
        assertEquals(new int[]{-10, 54}, ArrayUtil.minMax(new int[]{-10, 3, 54}));
    }
    @Test
    public void minMaxLength3()
    {
        assertEquals(new int[]{-100, 56}, ArrayUtil.minMax(new int[]{-100, -10, 0, 1, 4, 56}));
    }
    
}
