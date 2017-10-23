/******************************************************************************
 *  Purpose: To find prime numbers between 0 and 1000.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   23-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.ArrayList;

public class PrimeNumbers {

	
	public static void main(String args[])
	{
		prime();
	}
	
	
	/*
	 * method to find whether prime or not
	 */
	public static void prime()
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<1000; i++)
		{
			if(calculation(i) == true)
			{
			 list.add(i);
			}
		}
		int sizeOfList = list.size();
		store(list,sizeOfList);
	}
	
	/*
	 * method to calculate prime number one by one
	 */
	public static boolean calculation(int number)
	{
		boolean isPrime = false;
		int counter=0;
		for(int i=1;i<=number;i++)
		{
			if(number % i == 0)
			{
				counter++;
			}
		}
		if(counter == 2)
		{
			return true;
		}
		else
		{
			return isPrime; 
		}
	}
	
	
	/*
	 * method to store prime numbers in 2D array
	 */
	public static void store(ArrayList list, int size)
	{
		int element = 0;
		int array[][] = new int[13][13];
		for(int i=0;i<13;i++)
		{
			for(int j=0; j<13; j++)
			{
				array[i][j] = (int) list.get(element);
				element++;
			}
		}
		display(array);
	}
	
	
	/*
	 * method to display prime numbers in a 2D array
	 */
	public static void display(int[][] array)
	{
		for(int i=0;i<13;i++)
		{
			for(int j=0; j<13;j++)
			{
				System.out.println(array[i][j]);
			}
		}
	}

}
