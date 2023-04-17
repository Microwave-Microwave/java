import java.util.*;

class Distance
{
    public static void main( String[] args)
    {
        //-----------------------------------
        //Distance
        //-----------------------------------
        List<Point> point_list = new ArrayList<Point>();

        int counter = 1;
        double prev = 0;
        for (String s : args) 
        {
            double current = Double.parseDouble(s);
            if (counter %2 == 0)
            {
                Point p = new Point(prev, current);
                point_list.add(p);
            }
            else
            {
                prev = current;
            }
            counter++;
        }


        System.out.printf("point list size: %d\n", point_list.size());

        counter = 1;
        double distance = 0;
        Point p1 = point_list.get(0);
        
        for (int i = 1; i < point_list.size(); i++)
        {
            distance += p1.distance(point_list.get(i));
            p1 = point_list.get(i);
        }

       System.out.printf("distance: %f\n", distance);

    }
}

class Point
{
    public double x;
    public double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    void move(double dx, double dy)
    {
        x += dx;
        y += dy;
    }

    void mirror(Point p)
    {
        x = 2 * p.x - x;
        y = 2 * p.y - y;
    }

    double distance(Point p)
    {
        return Math.sqrt( (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    void Print()
    {
       System.out.printf("x: %f y: %f\n", x, y);
    }
}