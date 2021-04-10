
public class CheckingAccount extends BankAccount
{
	public static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initialAmount)
	{
		super(name, initialAmount);
		
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{		
		amount += FEE;
		
		
		 double newBalance = getBalance();
		
		 boolean completed = true;

		if (amount <= getBalance())
		{
			setBalance(newBalance = newBalance - amount);
		}
		else
		{
			completed = false;
		}
		return completed;
	}
	
}
