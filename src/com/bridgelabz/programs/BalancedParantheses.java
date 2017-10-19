/****************************************************************************** 
 *  Purpose: program to accept an arithmetic equation from user, and determine 
 *  		 whether it has balanced parentheses or not.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   18-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
import java.util.*;

public class BalancedParantheses {

	static Stack stack = new Stack();
	static int sizeOfStack=stack.size();
	static int pushCount=0, popCount=0;
	
	public static void main(String args[])
	{
		calculation();
		peek();
	}
	
	/*
	 * method to calculate balanced parenthesis
	 */
	public static void calculation()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an arithmetic expression ");
		String string = scanner.next();
		int length = string.length();
		
	
		for(int i=0;i<length;i++)
		{
			if(string.charAt(i)=='(')
			{
				push();
			}
			else if (string.charAt(i)==')')
			{
				pop();
			}
		}
		
		if(sizeOfStack==0)
		{
			System.out.println("expression is balanced");
		}
		else
		{ 
			System.out.println("expression is not balanced");
		}	
	}

	/*
	 * method to push elements onto stack
	 */
	public static void push()
	{
		stack.push("(");
		pushCount++;
		sizeOfStack++;
	}
	
	/*
	 * method to pop elements from stack
	 */
	public static void pop()
	{
		stack.pop();
		popCount++;
		sizeOfStack--;
	}
	
	/*
	 * method to get the front element on stack
	 */
	public static void peek()
	{
		if(stack.empty()==true)
		{
			System.out.println("stack is empty. nothing on top");
		}
		else
		System.out.println("top is "+stack.peek());
	}

}