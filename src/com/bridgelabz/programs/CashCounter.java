/******************************************************************************
 *  Purpose: To create a queue of banking cash counter and maintain a record 
 *  		 for enqueue and dequeue
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   22-10-2017
 *
 ******************************************************************************/
 
 import java.util.Scanner;
 
 public class CashCounter
 {
	 static Queue queue = new Queue();
	 static Scanner scanner = new Scanner(System.in);
	 static String name;
	 
	public static void main(String args[])
	{
		enqueue();	
	}
	
	public static void enqueue()
	{
	System.out.println("enter your name");
	name = scanner.next();	
	queue.add(name);
	System.out.println("current balance in your account is 10000");
	System.out.println("do you wish to withdraw or deposit? \n 1:withdraw \n 2:deposit");
		int choice = scanner.nextInt();
		if(choice == 1)
		{
			cashWithdraw();
		}
		else 
		{
			cashDeposit();
		}
		
	}
	
	public static void cashWithdraw()
	{
	int currentBalance = 10000;
	System.out.println("enter amount to withdraw");
	int withdrawAmount = scanner.nextInt();
	System.out.println("amount withdrawn :"+withdrawAmount);
	currentBalance = currentBalance - withdrawAmount;
	System.out.println("remaining balance is :"+currentBalance+" Rs");
	System.out.println("what to do you wish to do ? \n 1: withdraw again \n 2:deposit \n 3:display details");
	int choiceAgain = scanner.nextInt();
	if(choiceAgain == 1)
	{
		cashWithdraw();
	}
	else if (choiceAgain == 2)
	{
		cashDeposit(currentBalance);
	}
	else
	{
		display(name,currentBalance);
	}
	
	}
	
	public static void cashDeposit(int currentBalance)
	{
		System.out.println("enter amount of money you want to deposit");
		int depositAmount = scanner.nextInt();
		int newBalance = currentBalance + depositAmount; 
		System.out.println("your amount is deposited successfully! \n your current balance is "+newBalance+" Rs");
		System.out.println("what to do you wish to do ? \n 1: deposit again \n 2:withdraw \n 3:display");
		int choiceAgain = scanner.nextInt();
		if(choiceAgain == 1)
		{
		cashWithdraw();
		}
		else if (choiceAgain == 2)
		{
		cashDeposit(currentBalance);
		}
		else
		{
			display();
		}
	}
	
	public static void display(String name, int currentBalance)
	{
		System.out.println("Name: "+name+"\n current balance: "+currentBalance);
	}
 }