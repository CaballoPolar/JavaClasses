// Ben Hale
// Professor Kelly
// "Savings Account"
// CS 2163
// 9 SEP 2022
import java.util.Date;

public class SavingsAccount 
{
	//variables
	String nickname = "";
	double balance = 0;
	double annualIntRate = 0;
	Date dateEstablished = new Date();
	
	//no-argument constructor
	public SavingsAccount()
	{
		
	}
	
	//constructor for id and balance
	public SavingsAccount(String nickname, double balance) {
		super();
		this.nickname = nickname;
		this.balance = balance;
	}
	
	//getters
	public String getNickname() {
		return nickname;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualIntRate() {
		return annualIntRate;
	}
	
	//setters
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}

	
	
	@Override
	public String toString() {
		return "Savings Account Name: " + nickname + "\n\nBalance: $" + balance + "0" + "\n\nAnnual Interest Rate: $" + 
				getMonthlyIntRate(annualIntRate, balance) + "0" + "\n\nDate of Account Creation: " + dateEstablished;
	}

	//accessor for dateEstablished
	public Date getDateEstablished() {
		return dateEstablished;
	}
	
	//deposit method
	public void deposit(double balance, double depositAmount)
	{
		setBalance(balance += depositAmount);
	}
	
	//monthly interest rate method
	public double getMonthlyIntRate(double annualIntRate, double balance)
	{
		return (annualIntRate/1200 * balance);
	}
}
