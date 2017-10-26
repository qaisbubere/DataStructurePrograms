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
	public static void palindromeChecking(){	
		System.out.println("enter a string");
		String input = scanner.next();
		int length = input.length();
		
		for(int i=0; i<length ; i++){
			deque.addLast(input.charAt(i));
		}
		
		//reversing a string
		char []array= input.toCharArray();
		char reverse[] = new char[array.length];
		int j=0,count=0;
		
		/*
		 * for loop to reverse a string
		 */
		for(int i=array.length-1; i>=0;i--){
		reverse[j]= array[i];
		j++;
		}
		/*
		 *  for loop ends
		 */
		
		
		/*
		 * for loop to compare original string with reverse string 
		 */
		for(int i=0; i<array.length;i++){
			for(j=i; j<=i ;j++){
			if(array[i]==reverse[j])
				count++;
			}
		}
		/*
		 * for loop ends
		 */
		
		/*
		 * if-else loop to determine whether it is palindrome or not
		 */
		if(count==array.length)
			System.out.println("it is palindrome");
		else
			System.out.println("not palindrome");
		/*
		 * if-else loop ends
		 */
	}
}
