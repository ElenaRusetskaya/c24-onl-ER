package lesson9;

public class Rabbit implements Animal
{
    @Override
    public void voice()
    {
        System.out.println("Rabbit snuffling");
    }
    @Override
    public void eat(String food)
    {
        switch (food)
        {
            case "Meat":
                System.out.println("Meat: I do not eat meat");
                break;
            case "Grass":
                System.out.println("Grass: I eat grass");
                break;
            case "Fish":
                System.out.println("Fish: I do not eat fish");
                break;
            default:
                System.out.println("Other food: I don't like it");
        }
    }
}
