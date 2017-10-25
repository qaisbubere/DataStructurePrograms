package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);
	static LinkedList<String> Stringlinkedlist = new LinkedList<String>();
	static LinkedList<Integer> Intlinkedlist = new LinkedList<Integer>();
	
	public static void unorderedList() throws IOException{
		File file =new File("/home/bridgeit/Desktop/unorderedlist.txt");
		
		/*
		 * if-else loop to find if file already exist or new file is created
		 */
		if(file.exists())
			System.out.println("file already exist");
		else
			System.out.println("file created");
		/*
		 * end of loop
		 */
		
		//writing a file
		FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/unorderedlist.txt");    
		filewriter.write("this,is,a,program,for,unordered,linked,list");    
		filewriter.close();
        int length = (int) file.length();

		FileReader filereader = new FileReader("/home/bridgeit/Desktop/unorderedlist.txt");
	    BufferedReader bufferedreader = new BufferedReader(filereader);
		
	    String string= bufferedreader.readLine();
	    String []splitted = new String[length];
	    splitted = string.split(",");
	    
	    Arrays.sort(splitted);
	    for(String show : splitted){
	    	System.out.println(show);
	    }
	    
	    for(int i=0; i<splitted.length;i++){
	    	Stringlinkedlist.add(splitted[i]);
	    }
	    addOrRemove();
}
		
		/*
		 * method to add or remove elements
		 */
		public static void addOrRemove() throws IOException{
			try{
			 System.out.println("enter a word to search");
		       String search= scanner.next();
           
		       if(search == (String)search){
		       /*		   
		        * if-else loop to add and remove element
		        */
		      
		       if(Stringlinkedlist.contains(search)){
		    	   Stringlinkedlist.remove();
		    	   System.out.println("element found. its being removed");
		       }
		       else
		       {
		    	   Stringlinkedlist.add(search);
		    	   System.out.println("element not found. its being added");
		       }
		       /*
		        * end of loop
		        */
		
		       System.out.println("do you wish to continue? \n 1:yes or 2:no");
		       int answer = scanner.nextInt();
		       if(answer == 1)
		    	   addOrRemove();
		       else 
			    elementStoringIntoFile();
		       }
		       else{
		    	   System.out.println("invalid input");
		       }
			}
			
			catch(Exception e){
				System.out.println("invalid input");
			}
		}
			
		
		/*
		 * method to store words to file
		 */
		public static void elementStoringIntoFile() throws IOException{
			FileWriter writer=new FileWriter("/home/bridgeit/Desktop/unorderedlist.txt");  
			BufferedWriter bufferwriter = new BufferedWriter(writer);
			for(int i=0; i<Stringlinkedlist.size();i++){
			bufferwriter.write(Stringlinkedlist.get(i)+" ");
			}
			bufferwriter.flush();
			bufferwriter.close();
			System.out.println("elements added to list");
		}
		
		
		/*
		 * method for ordered list
		 */
		public static void orderedList() throws IOException{
			 File file = new File("/home/bridgeit/Desktop/Orderedlist.txt");
			 if(file.exists())
			 {
				 System.out.println("file already exist");
			 }
			 else
			 {
				 System.out.println("file created ");
			 }
			 
			 
			 FileWriter filewriter = new FileWriter("/home/bridgeit/Desktop/Orderedlist.txt");
			 filewriter.write("5 6 2 3 7 5 7");
			 filewriter.close();
			 int length = (int)file.length();
			

			 FileReader filereader = new FileReader("/home/bridgeit/Desktop/Orderedlist.txt");
			 BufferedReader bufferedreader = new BufferedReader(filereader);
			 String data = bufferedreader.readLine();
			 String splitted[] = new String[length];
			 splitted = data.split(" ");
			 for(int i=0; i<splitted.length;i++){
				 Intlinkedlist.add(Integer.valueOf(splitted[i]));
			 }
			
			 for(String display:splitted){
				 System.out.println(display);
			 }
			 pushOrPop();
		}
		
		
		/*
		 * method to push and pop elements
		 */
		public static void pushOrPop() throws IOException{
			try{
				System.out.println("enter an element to search");
				int search = scanner.nextInt();
	
			/*
			 * if-else loop to check if value entered for search is integer or not
			 */
			if(search== (int)search){
				
				/*
				 * if-else loop to check whether element is present in the list or not
				 */
				if(Intlinkedlist.contains(search)){
					Intlinkedlist.remove();
					System.out.println("element removed");
				}
				else{
					Intlinkedlist.add(Integer.valueOf(search));
					System.out.println("element added");
				}
				System.out.println("do you wish to continue? \n 1:yes or 2:no");
			       int answer = scanner.nextInt();
			       if(answer == 1)
			    	   pushOrPop();
			       else
			    	   elementInsertIntoFile();			
				}
			else
			{
				System.out.println("enter integer number");
			}}
			catch(Exception e){
				System.out.println("input is invalid");			
				}
			
			/*
			 * end of loop
			 */
		}
		
		
		/*
		 * method to store element into file
		 */
		public static void elementInsertIntoFile() throws IOException{
			System.out.println("element added to file");
			FileWriter filewriter = new FileWriter("/home/bridgeit/Desktop/Orderedlist.txt");
			BufferedWriter bufferwriter = new BufferedWriter(filewriter);
			for(int i=0; i<Intlinkedlist.size();i++){
			bufferwriter.write(Intlinkedlist.get(i)+" ");
			}
			bufferwriter.flush();
			bufferwriter.close();
			System.out.println(Intlinkedlist);
			 
		}
}
