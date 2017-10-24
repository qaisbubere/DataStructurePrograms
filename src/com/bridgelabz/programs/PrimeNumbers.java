/******************************************************************************
 *  Purpose: To find prime numbers between 0 and 1000 and print them in a 2D 
 *			 array form.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   24-10-2017
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
	 * method to print prime number in a 2D array
	 */
	public static void prime()
	{
		int prime=0,place=0,i;
		int newLine=100;
		int array1[] = new int[168];
		int array2[][]=new int[10][100];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(i=2; i<1000; i++)
		{
			if(calculation(i) == true)
			{
				array1[place]=i;
				place++;
			}
		}
				
		place =0;
		for(int j=0;j<2;j++)
		{
			for(int k=0 ; k<84; k++)
			{
				array2[j][k] = array1[place];
				place++;
			}
		}
		
		for(int j=0;j<2;j++)
		{
			for(int k=0 ; k<84; k++)
			{
				if(array2[j][k] < newLine)
				{
				System.out.print(array2[j][k]+" ");
				}
				else
				{
					System.out.println();
					System.out.print(array2[j][k]+" ");
					newLine = newLine+100;
				}
			}
		}		
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
}
