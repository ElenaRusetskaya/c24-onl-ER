package lesson8.hw2;

public class Circle extends Figure
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    @Override
    public double square()
    {
        return Math.PI * (radius * radius);
    }
}
