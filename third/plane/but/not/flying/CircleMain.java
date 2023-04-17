package plane;

import point2d.Point;
import plane.Circle;

public class CircleMain
{
    public static void main( String[] args)
    {

        Circle circle = new Circle();
        System.out.printf("Area of circle: %f\n", circle.GetArea());

        circle.Set(5, 2, 10);
        System.out.printf("Area of circle: %f\n", circle.GetArea());

        //circle.Set(5, 2, 0);
        //System.out.printf("Area of circle: %f\n", circle.GetArea());

        //Circle circle2 = new Circle(0, 0, 0);
        //System.out.printf("Area of circle: %f\n", circle2.GetArea());
    }
}
