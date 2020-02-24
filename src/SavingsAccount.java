public class SavingsAccount {
	private static double annualInterestRate;

    private double savingsBalance;

    public void calculateMonthlyInterest()
    {
        savingsBalance += (savingsBalance * annualInterestRate / 12.0);
    }

    public static void setInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public void setSavingsBalance(double balance)
    {
        savingsBalance = balance;
    }

    public SavingsAccount(double balance)
    {
        setSavingsBalance(balance);
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }

}
