/****************************************************************************** 
 *  Purpose: to create an unordered list and reading and writing elements 
 *  		 from a file.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   19-10-2017
 *
 ******************************************************************************/
//package com.bridgelabz.programs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnOrderedList {
	static ArrayList<String> list = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) throws IOException
	{
		unorderedList();
		elementSearching();
	}
	
	/*
	 * method 
	 */
	public static void unorderedList() throws IOException
	{
		int elementFound=0;
		//File file =new File("/home/bridgeit/Desktop/unorderedlist.txt");
		File file = new File("C:/Users/Qais/Desktop/unorderedlist.txt");
		if(file.exists())
		{
			System.out.println("file already exist");
		}
		else
		{
			System.out.println("file created");
		}
		
		//writing a file
		//FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/unorderedlist.txt");    
		FileWriter filewriter=new FileWriter("C:/Users/Qais/Desktop/unorderedlist.txt");    
		filewriter.write("this,is,a,program,for,unordered,linked,list");    
		filewriter.close();
        int length = (int) file.length();

		
        //reading from file
		FileReader filereader = new FileReader("C:/Users/Qais/Desktop/unorderedlist.txt");
	    BufferedReader bufferedreader = new BufferedReader(filereader);
		
	    String string= null;
	    String []splitted = new String[length];
        while ((string = bufferedreader.readLine()) != null) 
        {
            splitted = string.split(",");
            for(String display:splitted)
            {
            System.out.println(display);
            }
        }
        
        //adding elements to list
        for(int i=0;i<splitted.length;i++)
        {
            list.add(splitted[i]);
        }
        System.out.println();
        for(String i: list)
        {
        	System.out.println(i);
        }
        Arrays.sort(splitted);
		System.out.println("sorted elements are");
		for(String sort:splitted)
		{
			System.out.println(sort);
		}
		System.out.println();
	}
	
		/*
		* method to search the element in the list
		*/
		public static void elementSearching()
		{
        System.out.println("enter a word to search");
        String search= scanner.next();
		
		if(list.contains(search))
		{
			list.remove(search);
			askAgain();
		}
		else
		{
			list.add(search);
			askAgain();
		}
		}
		
		
		/*
		* method to ask again for inserting or removing an element
		*/
		public static void askAgain()
		{
			System.out.println("do you want to search again? \n 1:yes \n 2:no");
			int searchAgain = scanner.nextInt();
			if(searchAgain == 1)
			{
				elementSearching();
			}
			else
			{
				displayList();
			}
		}
		
		
		/*
		* method to display the final list
		*/
		public static void displayList()
		{
			System.out.println(list);
		}   
    }

