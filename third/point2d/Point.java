package point2d;

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(double x)
    {
        this(x, x);
    }

    public Point()
    {
        this(0, 0);
    }


    public void Move(double dx, double dy)
    {
        x += dx;
        y += dy;
    }

    public void Mirror(Point p)
    {
        x = 2 * p.x - x;
        y = 2 * p.y - y;
    }

    public double Distance(Point p)
    {
        return Math.sqrt( (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    public void Print()
    {
       System.out.printf("x: %f y: %f\n", x, y);
    }

    public double GetX()
    {
        return x;
    }

    public double GetY()
    {
        return y;
    }

    public void SetX(double x)
    {
        this.x = x;
    }

    public void SetY(double y)
    {
        this.y = y;
    }

    public void Set(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}