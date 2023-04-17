package plane;

import point2d.Point;

public class Circle
{
    Point o;
    double r;

    public Circle(Point o, double r)
    {
        if (r <= 0)
            throw new IllegalArgumentException("a sugara 0 vagy negatív szám");
        this.o = o;
        this.r = r;
    }

    public Circle(Point o)
    {
        this(o, 1);
    }

    public Circle(double r)
    {
        this(new Point(0, 0), r);
    }

    public Circle(double x, double y, double r)
    {
        this(new Point(x, y), r);
    }

    public Circle()
    {
        this(new Point(0, 0), 1);
    }

    public void Enlarge(double f)
    {
        r = r * f;
    }

    public double GetArea()
    {
        return Math.PI * r * r;
    }

    public void SetPoint(double x, double y)
    {
        o.Set(x, y);
    }

    public void SetPoint(Point p)
    {
        o = p;
    }

    public void SetRadius(double r)
    {
        if (r <= 0)
            throw new IllegalArgumentException("a sugara 0 vagy negatív szám");
        
        this.r = r;
    }

    public void Set(Point p, double r)
    {
        SetPoint(p);
        SetRadius(r);
    }

    public void Set(double x, double y, double r)
    {
        SetPoint(x, y);
        SetRadius(r);
    }

    public void Print()
    {
        System.out.printf("x: %f y: %f r: %f\n", o.GetX(), o.GetY(), r);
    }
}