/****************************************************************************** 
 *  Purpose: to create an unordered linked list and reading and writing elements 
 *  		 from a file.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   19-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnOrderedList {

	public static void main(String args[]) throws IOException
	{
		unorderedList();
	}
	
	/*
	 * 
	 */
	public static void unorderedList() throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		File file =new File("/home/bridgeit/Desktop/unorderedlist.txt");
		if(file.exists())
		{
			System.out.println("file already exist");
		}
		else
		{
			System.out.println("file created");
		}
		
		//writing a file
		FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/unorderedlist.txt");    
		filewriter.write("this,is,a,program,for,unordered,linked,list");    
		filewriter.close();
        int length = (int) file.length();

		
        //reading from file
		FileReader filereader = new FileReader("/home/bridgeit/Desktop/unorderedlist.txt");
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
        ArrayList<String> list = new ArrayList<String>();
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
        //user input to search a word
        System.out.println("enter a word to search");
        String search= scanner.next();
        
        
	}
}
