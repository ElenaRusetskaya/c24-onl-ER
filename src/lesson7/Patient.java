package lesson7;

public class Patient
{
    private int healPlan;
    private Doctor doctor;
    public Patient(int healPlan)
    {
        this.healPlan = healPlan;
    }
    public int getHealPlan()
    {
        return healPlan;
    }
    public void healMethod()
    {
        doctor.heal();
    }
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }
}
