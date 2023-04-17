import java.lang.Math;

class PointMain
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

        System.out.printf("distance p1 to p2: %f\n", p1.distance(p2));

        System.out.printf("p1 mirrored to p2:\n");
        p1.mirror(p2);
        p1.Print();

        //-----------------------------------
        //Complex
        //-----------------------------------
        System.out.printf("------------------\n");
        System.out.printf("Complex\n");

        Complex c1 = new Complex(-2, 3);
        c1.Print();
        System.out.printf("abs value: %f\n", c1.abs());


        System.out.printf("multiplication test\n");
        Complex c2 = new Complex(3, 2);
        Complex c3 = new Complex(1, 4);
        c2.Print();
        c3.Print();

        System.out.printf("new value: \n");
        c2.mult(c3);
        c2.Print();
        
        //-----------------------------------
        //Circle
        //-----------------------------------
        System.out.printf("------------------\n");
        System.out.printf("Circle\n");

        Point c_o = new Point(2, 4);
        Circle circle = new Circle(c_o, 3);
        circle.Print();
        System.out.printf("Area of circle: %f\n", circle.getArea());

    }
}

class Line
{
    //ax + by = c
    double a;
    double b;
    double c;

    public Line(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public bool contains(Point p)
    {
        double value = p.x * a + p.y * b;
        return value == c;
    }
}

class Circle
{
    Point o;
    double r;

    public Circle(Point o, double r)
    {
        this.o = o;
        this.r = r;
    }

    void enlarge(double f)
    {
        r = r * f;
    }

    double getArea()
    {
        return Math.PI * r * r;
    }

    void Print()
    {
        System.out.printf("x: %f y: %f r: %f\n", o.x, o.y, r);
    }
}

class Complex
{
    double a;
    double b;

    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    void conjugate()
    {
        b = b * -1;
    }

    void reciprocate()
    {
        double cuccli = (a * a + b * b);
        a = a / cuccli;
        b = (-1 * b) / cuccli;
    }

    void div(Complex c)
    {
        bool cuccli = (c.a * c.a + c.b * c.b);
        bool x = (a * c.a + b * c.b) / cuccli;
        bool y = (b * a.b - a * b.c) / cuccli;

        a = x;
        b = y;
    }

    void add(Complex c)
    {
        this.a += c.a;
        this.b += c.b;
    }

    void sub(Complex c)
    {
        this.a -= c.a;
        this.b -= c.b;
    }

    void mult(Complex c)
    {
        //(a + b) (c.a + c.b) = (a * c.a - b * c.b) + (a * c.b + b)
        double x = a * c.a - b * c.b;
        double y = a * c.b + b * c.a;

        a = x;
        b = y;
    }

    double abs()
    {
        return Math.sqrt(a*a + b*b);
    }

    void Print()
    {
        System.out.printf("a: %f b: %f\n", a, b);
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