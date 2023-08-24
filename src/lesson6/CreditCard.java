package lesson6;

public class CreditCard
{
    private String accountBank;
    private double currentValue;
    public CreditCard(String accountBank)
    {
        this.accountBank = accountBank;
        this.currentValue = 100;
    }
    public void addValue(double valueAdd)
    {
        this.currentValue = this.currentValue + valueAdd;
    }
    public void withdrawSum(double sumWithdram)
    {
        this.currentValue = currentValue - sumWithdram;
    }
    public String getInfo()
    {
        return "Bank account number " + this.accountBank;
    }
    public String getValue()
    {
        return "The amount on the account " + this.currentValue;
    }
}
