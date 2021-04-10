
public class SavingsAccount extends BankAccount
{
	
	public double rate = 2.5;
	
	public int savingsNumber = 0;
	
	public String accountNumber;
	
	public SavingsAccount(String name, double initialAmount)
	{
		super(name, initialAmount);
		
		accountNumber = super.getAccountNumber();
	}
	
	public void postInterest()
	{
		double interest = (getBalance() * rate * 0.01) / 12; //monthly interest added
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return (accountNumber + "-" + savingsNumber);
	}
	
	// copy constructor
	public SavingsAccount(SavingsAccount name, double initialAmount)
	{
		super(name, initialAmount);
		
		savingsNumber++;
		accountNumber = super.getAccountNumber() ;
	}
}
