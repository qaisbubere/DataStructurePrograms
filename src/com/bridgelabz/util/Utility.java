package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import com.bridgelabz.util.QueueArray;

public class Utility<T> {

	static Scanner scanner = new Scanner(System.in);
	static LinkedList<String> Stringlinkedlist = new LinkedList<String>();
	static LinkedList<Integer> Intlinkedlist = new LinkedList<Integer>();
	static 	Map<Integer,LinkedList<Integer>> hashmap = new HashMap<Integer,LinkedList<Integer>>();
	static ArrayList list = new ArrayList();
	int remainingBalance=10000,count,people,currentBalance;
	static String string1,string2,reverse;
	
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
		
		
		/*
		 * method for cash counter
		 */
		public <T> void cashCounter() {
			currentBalance = 10000;
			System.out.println("for how many people you want to do transaction?");
			count = scanner.nextInt();
			QueueArray<T> object = new QueueArray<T>(count);
			people = 0;
			distinctUser(object);
		}
		
		
		/*
		 * method for performing transactions for distinct users
		 */
		public void distinctUser(QueueArray object){
			while(people != count){
			people++;
			System.out.println("enter your name");
			T name = (T) scanner.next();	
			object.enQueue(name);
			System.out.println("current balance in your account is 10000");
			System.out.println("1:withdraw \n 2:deposit");
			int choice = scanner.nextInt();
			
			if(choice == 1){
				cashWithdraw(currentBalance,object);
			}
			else if(choice == 2){
				cashDeposit(object);
			}
			else{
				System.out.println("wrong choice");
			}
			}
		}
		
		
		/*
		 * method to withdraw cash
		 */
		public void  cashWithdraw(int currentBalance, QueueArray object){
			System.out.println("enter amount to withdraw");
			int withdrawAmount = scanner.nextInt();
			
			/*
			 * if-else loop to check whether account is empty or not
			 * (loop number 1)
			 */
			if(currentBalance >0){
				
				/*
				 * if-else loop to withdraw cash and ask for choice
				 * (loop number 2)
				 */
				if(withdrawAmount <=currentBalance){
					System.out.println("amount withdrawn :"+withdrawAmount);
					remainingBalance = currentBalance - withdrawAmount;
					System.out.println("remaining balance is :"+remainingBalance+" Rs");
					System.out.println("what to do you wish to do ? \n 1: withdraw again \n 2:deposit \n 3:exit");
					int choiceAgain = scanner.nextInt();
					
					if(choiceAgain == 1){
						cashWithdraw(remainingBalance,object);
					}
					else if(choiceAgain ==2){
						cashDeposit(object);
					}
					else{
						T returnedElement = (T) object.deQueue();
						System.out.println("removed "+returnedElement);
						distinctUser(object);
					}
					}
				else{
					System.out.println("not enough cash to dispense. enter amount less than "+currentBalance);
					cashWithdraw(currentBalance,object);
					}
				/*
				 * loop number 2 ends
				 */
			}
			else{
				System.out.println("your account is empty. do you wish to deposit amount? 1:yes \n 2:no");
				int choice = scanner.nextInt();
				if(choice == 1){
					cashDeposit(object);
				}
				else{
					distinctUser(object);
				}
			}
			/*
			 * loop number 1 ends
			 */
		}
		
		
		/*
		 * method to deposit cash
		 */
		public void cashDeposit(QueueArray object){
			System.out.println("enter amount of money you want to deposit");
			int depositAmount = scanner.nextInt();
			int newBalance = remainingBalance + depositAmount; 
			System.out.println("your amount is deposited successfully! \n your current balance is "+newBalance+" Rs");
			System.out.println("what to do you wish to do ? \n 1: deposit again \n 2:withdraw \n 3:exit");
			int choiceAgain = scanner.nextInt();
			
			/*
			 * if-else loop to ask for users choice
			 */
			if(choiceAgain == 1){
				cashDeposit(object);
			}
			else if(choiceAgain == 2){
				cashWithdraw(newBalance,object);
			}
			else{
				T returnedElement = (T) object.deQueue();
				System.out.println("removed "+returnedElement);
				distinctUser(object);
			}
			/*
			 * if-else loop ends
			 */
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
		
		
		/*
		 * method to find prime numbers
		 */
		public static void primeNumberAndAnagram(){
			int []primeArray = new int[168];
			int place=0;
			for(int i=2; i<1000;i++){
				if(primeFinding(i)==true){
				primeArray[place] =i;
				place++;
				}
			}
			anagramFinding(primeArray);
		}
		
		
		/*
		 * method for calculating prime number
		 */
		public static boolean primeFinding(int number){
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
		 * method for finding anagrams out of prime numbers
		 */
		public static void anagramFinding(int[] primeArray){
		try{	
			int count=0;
			int []array1 = new int[168];
		int []array2 = new int[168];
			int []number = new int[168];
			System.out.println("qais");
			for(int i=0; i<168; i++){
				array1[i] = primeArray[i];
				string1 = array1.toString();
				//reverse =new StringBuffer(string1).reverse().toString();
				//number[i] = Integer.parseInt(reverse);
				for(int j=i+1; j<168;j++){
					array2[j] = primeArray[j];
					string2 = array1.toString();
					count=0;
					for(int a=0; a<string1.length();i++){
						for(int b=0; b<string2.length();b++){
							if(string1.charAt(a) == string2.charAt(b)){
								char temp =string2.charAt(b) ;
								temp='$';
								count++;
								break;
							}
						}
					}
					if(count==string1.length()){
						System.out.println("it is anangram");
					}
					else{
					System.out.println("not anagram");
					}
				}
				//string1="";
				//reverse="";
			}
			
			
		
		}
		catch(NumberFormatException e){
			
		}
		}
		
		
		/*
		 * method for hash map
		 */
		public static  void hashMap(String sourceAddress) throws IOException{
		
			for (int i = 0; i < 11; i++) {
				hashmap.put(i, new LinkedList<Integer>());
	}
			int answer=1;
			File file = new File(sourceAddress);
			FileWriter filewriter = new FileWriter(sourceAddress);
			filewriter.write("1 2 3 4 5 6 7 8 9 10");
			filewriter.close();
			
			int length = (int)file.length();
			 FileReader filereader = new FileReader(sourceAddress);
			 BufferedReader bufferedreader = new BufferedReader(filereader);
			 String data = bufferedreader.readLine();
			 String splitted[] = new String[length];
			 splitted = data.split(" ");
			 for(int i=0; i<splitted.length;i++){
				list.add(splitted[i]);
			 }
			 
			 for(int i=0; i<list.size();i++){
			 System.out.println(list.get(i));
			 }
			 
			 /*
			  * while loop till answer is 1
			  */
			 while(answer ==1)
			 {
			 System.out.println("enter a number to search");
			 int number = scanner.nextInt();
			 
			 /*
			  * if-else loop to find if number already exist or not
			  */
			 if(list.contains(number)){
				 list.remove(number);
				 System.out.println("removed "+number);
			 }
			 else{
				 list.add(number);
				 System.out.println("added "+number);
			 }
			 /*
			  * end of if-else
			  */
			 addToSlot(number);
			 System.out.println("do you wish to continue? \n 1:yes \n 2:no");
			 answer=scanner.nextInt();
			 }
			 /*
			  * end of while loop
			  */
			 
			 
			 for (int i = 0; i < hashmap.size(); i++) {
					System.out.print(i+"  ");
					for (int j = 0; j < hashmap.get(i).size(); j++) {
						System.out.print(hashmap.get(i).get(j)+ "  ");
					}
					System.out.println();
		}
			 System.out.println(list);
		}
		
		
		/*
		 * method to add elements to appropriate slot
		 */
		public static void addToSlot(int element){
			int remainder =0 ;
			remainder = element % 11;
			hashmap.get(remainder).add(element);
			
		}
		
		
		/*
		 * method to calculate total number of binary trees
		 */
		public static void binarySearchTree()
		{
			int count =0;
			System.out.println("enter total nodes");
			int node = scanner.nextInt();
			
			long C = factorial(2*node);
		}
}
