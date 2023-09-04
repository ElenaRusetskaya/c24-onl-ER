package lesson9;

public class Dog implements Animal
{
    @Override
    public void voice()
    {
        System.out.println("Dog barks");
    }
    @Override
    public void eat(String food)
    {
        switch (food)
        {
            case "Meat":
                System.out.println("Meat: I eat meat");
                break;
            case "Grass":
                System.out.println("Grass: I do not eat grass");
                break;
            case "Fish":
                System.out.println("Fish: I can eat fish, but I don't like");
                break;
            default:
                System.out.println("Other food: I don't like it");
        }
    }
}
