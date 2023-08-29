package lesson7;

public class Surgeon extends Doctor
{
    @Override
    public void heal()
    {
        super.heal();
        System.out.println("Patient gets to the surgeon");
        System.out.println("The method of treatment is surgery");
    }
}
