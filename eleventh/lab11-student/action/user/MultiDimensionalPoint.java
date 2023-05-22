package action.user;

public class MultiDimensionalPoint implements action.Undoable, action.Scalable, Comparable<MultiDimensionalPoint>
{
    private int[] coordinates;
    private int[] lastCoordinates;

    public MultiDimensionalPoint(int... numbers)
    {
        int index = 0;
        coordinates = new int[numbers.length];
        for (int n : numbers)
        {
            coordinates[index] = n;
            index++;
        }

        lastCoordinates = new int[coordinates.length];
        saveToLast();
    }

    public int get(int n)
    {
        return coordinates[n];
    }

    public void set(int index, int value)
    {
        saveToLast();
        coordinates[index] = value;
    }

    @Override public void scale(int value)
    {
        saveToLast();
        for (int i = 0; i < coordinates.length; i++)
            coordinates[i] = coordinates[i] * value;
    }

    public void saveToLast()
    {
        System.arraycopy(coordinates, 0, lastCoordinates, 0, coordinates.length);
    }

    @Override public void undoLast()
    {
        int[] tmp = coordinates;
        coordinates = lastCoordinates;
        lastCoordinates = tmp;

    }

    @Override public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o instanceof MultiDimensionalPoint mdp)
        {
            for (int i = 0; i < coordinates.length; i++)
            {
                if (this.get(i) != mdp.get(i))
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override public int compareTo(MultiDimensionalPoint mdp)
    {
        if (mdp == this)
            return 0;
        if (mdp.coordinates.length == this.coordinates.length)
        {
            int mdp_value = 0;
            int this_value = 0;
            for (int i = 0; i < mdp.coordinates.length; i++)
            {
                mdp_value += mdp.get(i);
                this_value += this.get(i);
            }
            return this_value - mdp_value;
        }
        else
            return this.coordinates.length - mdp.coordinates.length;
    }
}