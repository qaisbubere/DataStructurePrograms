/******************************************************************************
 *  Purpose: To create a queue of banking cash counter and maintain a record 
 *  		 for enqueue and dequeue
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   22-10-2017
 *
 ******************************************************************************/
 package com.bridgelabz.programs;
 import java.util.*;
 import java.util.Scanner;
 
 public class CashCounter{
	 static Queue<String> queue = new LinkedList<String>();
	 static Scanner scanner = new Scanner(System.in);
	 static String name;
		 
	public static void main(String args[]){
		enqueue();	
		dequeue();
	}
	
	
	/*
	 * method to add users to queue
	 */
	public static void enqueue(){
	int currentBalance = 10000;
	System.out.println("enter your name");
	name = scanner.next();	
	queue.add(name);
	System.out.println("you were added to queue");
	System.out.println("current balance in your account is 10000");
	System.out.println("do you wish to withdraw or deposit? \n 1:withdraw \n 2:deposit");
	int choice = scanner.nextInt();
	
		if(choice == 1)
			cashWithdraw(currentBalance);
		else 
			cashDeposit(currentBalance);	
	}
	
	
	/*
	 * this method is to withdraw cash and maintaining remaining balance
	 */
	public static void cashWithdraw(int currentBalance){
		System.out.println("enter amount to withdraw");
		int withdrawAmount = scanner.nextInt();
		
		if(withdrawAmount <=currentBalance){
			System.out.println("amount withdrawn :"+withdrawAmount);
			currentBalance = currentBalance - withdrawAmount;
			System.out.println("remaining balance is :"+currentBalance+" Rs");
			System.out.println("what to do you wish to do ? \n 1: withdraw again \n 2:deposit \n 3:display details");
			int choiceAgain = scanner.nextInt();
			
			if(choiceAgain == 1)
				cashWithdraw(currentBalance);
			else if (choiceAgain == 2)	
				cashDeposit(currentBalance);
			else	
				display(name,currentBalance);	
		}
		else
		{
			System.out.println("not enough cash in your account \n please enter amount less than "+currentBalance);
			cashWithdraw(currentBalance);
		}
		
	}
	
	
	/*
	 * method to deposit cash in the account and maintaining balance
	 */
	public static void cashDeposit(int currentBalance){
		System.out.println("enter amount of money you want to deposit");
		int depositAmount = scanner.nextInt();
		int newBalance = currentBalance + depositAmount; 
		System.out.println("your amount is deposited successfully! \n your current balance is "+newBalance+" Rs");
		System.out.println("what to do you wish to do ? \n 1: deposit again \n 2:withdraw \n 3:display");
		int choiceAgain = scanner.nextInt();
		
		if(choiceAgain == 1)
			cashDeposit(newBalance);
		else if (choiceAgain == 2)
			cashWithdraw(newBalance);
		else
			display(name,newBalance);
	}
	
	
	/*
	 * method to display details of user
	 */
	public static void display(String name, int currentBalance){
		System.out.println("Name: "+name+"\n current balance: "+currentBalance);
		System.out.println();
		
		System.out.println("do you wish to do transactions for new user? \n 1:yes \n 2:no");
		int againTransaction = scanner.nextInt();
		
		if(againTransaction == 1)
			enqueue();
		else
			queueElements();
	}
	
	
	/*
	 * method for displaying elements in a queue
	 */
	public static void queueElements(){
		int length = queue.size();
		System.out.println("users in queue are: ");
		System.out.println(queue);
	}
	
	
	/*
	 * method to remove users from queue
	 */
	public static void dequeue(){
		String removeUser = queue.remove();
		System.out.println("removed "+removeUser);
		System.out.println(queue);
	}
 }