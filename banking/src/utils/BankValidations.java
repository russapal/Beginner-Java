package utils;
import custom_exceptions.BankingException;

public class BankValidations 
{
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE=5000;
	}
//add public static method to validate balance against min balance condition
	public static double validateBalance(double balance) throws BankingException
	{
		if(balance < MIN_BALANCE)
			throw new BankingException("Insufficient Funds !!!!!!!!!!!!!!!");
		return balance;
	}

}
