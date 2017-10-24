/******************************************************************************
 *  Purpose: To find prime numbers between 0 and 1000 that are anagram, and
 *  		 store it into the stack.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   24-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.Box.Filler;

public class PrimeNumber13 {

	static 	Stack stack = new Stack();
	public static void main(String[] args) {
		primeNumber();
	}
	
	
	/*
	 * method to print prime numbers if anagram
	 */
	public static void primeNumber() 
	{
		boolean isprimeNumber = false;
		int prime=0, place =0;
		int array[] = new int[168];
		
		for (int i = 2; i <1000; i++) 
		{
			if(calculation(i)==true)
			{
				array[place]=i;
				prime++;
				place++;
			}
		}
		anagram(array);
	}

	
	/*
	 * calculation of prime numbers
	 */
	public static boolean calculation(int number) 
	{
		boolean isPrime=false;
		int counter = 0;
		for (int i=1; i <=number; i++) {
			
			if (number % i == 0) 
				counter++;		
		}
			if(counter==2)		
				return true;		
			else
				return isPrime;
	}		
	
	
	/*
	 * method to find out whether prime number is anagram
	 */
	public static void anagram(int []array)
	{
		int flag=0,position=0;
		int array1[] = new int[array.length];
		int array2[] = new int[array.length];
		for(int i=5;i<array.length;i++)
		{
			for(int j=i+1; j<array.length;j++)
			{
				array1[position] = array[i];
				array2[position] = array[j];
				int length1 = array1.length;
				int length2 = array2.length;
				
				for(int k=0;k<length1;k++)
				{
					for(int l=0; l<length2; l++)
					{
						if(array1[k] == array2[l])
						{
							array2[l] = '$';
							flag=1;
							break;
						}
						else
						{
							flag =0;
						}
						
					}
				}
				
				if(flag==1)
				stack.add(array[i]);
				
				Arrays.fill(array2, (Integer) null);
			}
			Arrays.fill(array1, (Integer) null);
		}
		
		System.out.println("prime numbers which are anagrams are: ");
		
		System.out.println(stack);
	}
	}

