// Ben Hale
// Professor Kelly
// "Savings Account Runner"
// CS 2163
// 9 SEP 2022
import java.util.Scanner;

public class SavingsAccountRunner {

	public static void main(String[] args) 
	{
//		Write a test program that asks the user to enter their account number, initial balance, and annual 
//		interest rate (no need to perform error checking here – assume they enter the correct info).
		int selection = 0;
		double depositAmount = 0;
		SavingsAccount userAccount = new SavingsAccount();
		Scanner keyboard = new Scanner(System.in);
		Scanner numberPad = new Scanner(System.in);
		Scanner intPad = new Scanner(System.in);
		
		System.out.println("Please enter your Savings Account number: ");
		userAccount.setNickname(keyboard.nextLine());
		System.out.println("Please enter your initial balance: ");
		userAccount.setBalance(numberPad.nextDouble());
		System.out.println("Please enter your annual interest rate: ");
		userAccount.setAnnualIntRate(numberPad.nextDouble());
		
//		System.out.println(userAccount.toString());
		do 
		{	
			System.out.println("-------------------------------------------\n");
			System.out.println("      Please Review the Options Below      \n");
			System.out.println("  1. Deposit\n");
			System.out.println("  2. Check Monthly Interest\n");
			System.out.println("  3. Check Account Details\n");
			System.out.println("  4. EXIT\n");
			System.out.println("      Please Make a Selection: ");
			selection = intPad.nextInt();
		
			while (selection > 4 || selection < 0)
			{
				System.out.println("Invalid input. Please make a selection from the menu above: ");
				selection = intPad.nextInt();
			}
			
			if (selection == 1)
			{
				System.out.println("Please enter your deposit amount: ");
				depositAmount = numberPad.nextDouble();
				userAccount.deposit(userAccount.getBalance(), depositAmount);
				System.out.println("New balance: $" + userAccount.getBalance() + "0");
			}
			
			if (selection == 2)
			{
				System.out.println("Monthly Interest: $" + userAccount.getMonthlyIntRate(userAccount.getAnnualIntRate(), 
						userAccount.getBalance()) + "0");
			}
			
			if (selection == 3)
			{
				System.out.println(userAccount.toString());
			}
			
		}while(selection !=4);
		
		System.out.println("\n\nThanks, and have a wonderful day!");
//		Display list of options to deposit, check monthly interest, check account details, and exit the program.
//		Error checking is required on the menu selection portion (needs to be 1, 2, 3, or 4) and on the deposit 
//		amounts (needs to be > 0).
	}

}