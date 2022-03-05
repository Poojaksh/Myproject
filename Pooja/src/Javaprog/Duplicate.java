package Javaprog;

import java.util.Arrays;

public class Duplicate {


		 static void removeDuplicate(char str[], int length)   
		    {   
		      //Creating index variable to use it as index in the modified string   
		        int index = 0;   
		        for (int i = 0; i < length; i++) //Traversing character array   
		        {   
		        	int j;
		            for ( j = 0; j < i; j++)    
		            {   
		                if (str[i] == str[j])   
		                {   
		                    break;   
		                }   
		            }   
		    
		            // If the character is not present before, add it to resulting string   
		            if ( j == i)    
		            {   
		                str[index++] = str[i];   
		            }   
		        }   
		        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
		    }   
		    
		    
		    public static void main(String[] args)   
		    {   
		        String Name = "soony";  
		        char str[] = Name.toCharArray();//Converting string to character array 
		        int len = str.length;     
		        removeDuplicate(str, len);   

	}

}
