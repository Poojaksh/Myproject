package Javaprog;

public class Stringconcat {

	public static void main(String[] args) 
	{
		    String str1 = "Hello";  
	        String str2 = "pooja";  
	        String str3 = "Welcome";  
	        // Concatenating one string   
	        String str4 = str1.concat(str2);          
	        System.out.println(str4); 
	        System.out.println("  "); 
	        // Concatenating multiple strings  
	        String str5 = str1.concat(str2).concat(str3);  
	        System.out.println(str5);  
	        System.out.println("     ");
	        // different way
	        String s3=str1.concat(str2); 
	        System.out.println(s3);
	}

}
