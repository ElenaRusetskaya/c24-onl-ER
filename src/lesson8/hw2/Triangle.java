package lesson8.hw2;

public class Triangle extends Figure
{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double perimeter()
    {
        return (a + b + c);
    }
    @Override
    public double square()
    {
        double d = perimeter() / 2;
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }
}
