package lesson8.hw2;

public class Rectangle extends Figure
{
    private double a;
    private double b;
    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public double perimeter()
    {
        return (2 * a + 2 * b);
    }
    @Override
    public double square()
    {
        return (a * b);
    }

}
