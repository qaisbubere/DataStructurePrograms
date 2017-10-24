/******************************************************************************
 *  Purpose: To print calendar of given user input date.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   23-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
public class Calendar
{
    /*
     * method to match the given month and return its maximum days
     */
    int findMaxDay(String monthName, int year)
    {
        String months[] = {"","January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
        int date[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         
        if((year%400==0) || ((year%100!=0)&&(year%4==0)))     
        	date[2]=29;     
        int max = 0;
        for(int i=1; i<=12; i++)
        {
            if(monthName.equalsIgnoreCase(months[i]))       
                max = date[i];  //Saving maximum day of given month           
        }
        return max;
    }
     
    
    /*
     * method to match the given weekday name and return its weekday no.
     */
    int findDayNumber(String dayName)
    {
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", 
                            "Saturday"};
        int dayNumber = 0;
        for(int i=0; i<7; i++)
        {
            if(dayName.equalsIgnoreCase(days[i]))        
            	dayNumber = i;  //Saving week day no. given day (e.g. '0' for Sunday)          
        }
        return dayNumber;
    }
     
    
    /*
     * method for creating the calendar
     */
    void fillCalendar(int max, int dayNumber, String monthName, int year){
        int array[][] = new int[6][7];
        int x = 1, z = dayNumber;
     
        for(int i=0;i<6;i++){
            for(int j=dayNumber; j<7; j++){
                if(x<=max)
                	array[i][j] = x;
                    x++;              
            }
            dayNumber = 0;
        }
         
       for(int j=0; j<z; j++){ //Adjustment to bring last (6th) row elements to first row
        	array[0][j]=array[5][j];
        }    
         
        printCalendar(array, monthName, year); //Calling method to print the calendar
    }
     
    
    /*
     *  method for printing the calendar
     */
    void printCalendar(int array[][], String monthName, int y)
    {  
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t   "+monthName+" "+y); 
        System.out.println("\t----------------------------------------------------"); 
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------"); 
         
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(array[i][j]!=0)
                    System.out.print("\t "+array[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("\n\t----------------------------------------------------"); 
        }
    }
     
    
    public static void main(String args[])
    {
        Calendar object = new Calendar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        System.out.print("Enter the month name (e.g. January) : ");
        String monthName = scanner.next();
        System.out.print("Enter the week day name (e.g. Sunday) of 1st day of "+monthName+" : ");
        String dayName = scanner.next();
         
        int max = object.findMaxDay(monthName,year);
        int dayNumber = object.findDayNumber(dayName);        
        object.fillCalendar(max,dayNumber,monthName,year);
    }
}
