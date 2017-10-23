/******************************************************************************
 *  Purpose: To check whether the given string is palindrome or not, using deque.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   23-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeChecker {
	static Deque deque = new LinkedList<String>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		palindromeChecking();
	}
	
	
	/*
	 * method to take user input and check for palindrome
	 */
	public static void palindromeChecking()
	{
		
		System.out.println("enter a string");
		String input = scanner.next();
		int length = input.length();
		for(int i=0; i<length ; i++)
		{
			deque.addLast(input.charAt(i));
		}
		
		String reverse = new StringBuffer(input).reverse().toString();
		System.out.println(reverse);
		
		if(input.compareTo(reverse)==0)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
