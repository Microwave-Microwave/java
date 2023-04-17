package pointless;

import point2d.Point;

public class PointMain
{
    public static void main( String[] args)
    {
        //-----------------------------------
        //Point
        //-----------------------------------

        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(2.0, 5.0);

        p1.Print();
        p2.Print();

        System.out.printf("distance p1 to p2: %f\n", p1.Distance(p2));

        System.out.printf("p1 mirrored to p2:\n");
        p1.Mirror(p2);
        p1.Print();
    }
}
