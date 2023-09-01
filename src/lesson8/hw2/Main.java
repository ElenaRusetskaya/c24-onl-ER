package lesson8.hw2;

public class Main
{
    public static void main(String[] args)
    {
        Figure[] figures = new Figure[]{new Triangle(7,8,9), new Rectangle(4,5), new Circle(4), new Triangle(4,5,6), new Rectangle(9,8)};
        double sum = 0;
        for (Figure figure : figures)
        {
            sum += figure.perimeter();
            System.out.println(figure.getClass().getName() + " Perimeter: " + figure.perimeter() + " Square: " + figure.square());
        }
        System.out.println("Sum perimeter: " + sum);
    }
}
