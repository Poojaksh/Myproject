package Javaprog;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
			String n, reverse = ""; // Objects of String class  
		 	Scanner in = new Scanner(System.in); 
			 	{
					System.out.println("Enter a string/number to check if it is a palindrome");  
					n = in.nextLine();
				}   
		 	int length = n.length();   
	      	for ( int i = length - 1; i >= 0; i-- )  
		      	{
		         reverse = reverse + n.charAt(i);  
		      	}
		      if (n.equals(reverse))  
			      { 
			    	  System.out.println("Entered string/number is a palindrome.");  
			      }
		      else  
		         {
		    	  System.out.println("Entered string/number isn't a palindrome.");   
		         }      
	}
}
