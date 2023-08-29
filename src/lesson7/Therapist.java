package lesson7;

public class Therapist extends Doctor
{
    @Override
    public void heal()
    {
        super.heal();
        System.out.println("Therapist diagnoses");
    }

    public void actingDoctor(Patient patient)
    {
        if (patient.getHealPlan() == 1)
        {
           patient.setDoctor(new Surgeon());
        }
        else if (patient.getHealPlan() == 2)
        {
            patient.setDoctor(new Dentist());
        }
        else
        {
            patient.setDoctor(new Therapist());
        }
    }
}
