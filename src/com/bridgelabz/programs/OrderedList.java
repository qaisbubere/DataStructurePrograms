/******************************************************************************
 *  Purpose: To create an ordered list and reading and writing elements 
 *  		 from a file.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   22-10-2017
 *
 ******************************************************************************/
 
 import java.util.Scanner;
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
 public class OrderedList
 {
	 
	 public static void main(String args[]) throws IOException
	 {
		 orderedList();
	 }
	 
	 public static void orderedList() throws IOException
	 {
		 File file = new File("C:/Users/Qais/Desktop/Orderedlist.txt");
		 if(file.exists())
		 {
			 System.out.println("file already exist");
		 }
		 else
		 {
			 System.out.println("file created ");
		 }
		 
		 FileWriter filewriter = new FileWriter("C:/Users/Qais/Desktop/Orderedlist.txt");
		 filewriter.write("5 6 2 3 7 5 7");
		 filewriter.close();
		 
		 int length = (int)file.length();
		 
		 FileReader filereader = new FileReader("C:/Users/Qais/Desktop/Orderedlist.txt");
		 BufferedReader bufferedreader = new BufferedReader(filereader);
		 String string=null;
		 while((string=bufferedreader.readLine())!=null)
		 {
			 System.out.println(string);
		 }
		 
	 }
 }