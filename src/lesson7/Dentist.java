package lesson7;

public class Dentist extends Doctor
{
    @Override
    public void heal()
    {
        super.heal();
        System.out.println("Patient gets to the Dentist");
        System.out.println("The method - treat teeth");
    }
}
