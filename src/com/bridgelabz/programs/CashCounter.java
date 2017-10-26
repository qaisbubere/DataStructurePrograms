/******************************************************************************
 *  Purpose: To create a queue of banking cash counter and maintain a record 
 *  		 for enqueue and dequeue
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   22-10-2017
 *
 ******************************************************************************/
 package com.bridgelabz.programs;
 import java.util.*;
 import java.util.Scanner;
 import com.bridgelabz.util.Utility;

 public class CashCounter{
	 static Queue<String> queue = new LinkedList<String>();
	 static Scanner scanner = new Scanner(System.in);
	 static String name;
		 
	public static void main(String args[]){
		Utility object = new Utility();
		object.cashCounter();
	}
 }