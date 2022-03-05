package Javaprog;

public class string {
	public static void main(String[] args) {
		String str="sdff434ddf12";
		int total=0;
		String [] numStringArray =str.split("[^0-9]+");
		String [] numStringArray1 =str.split("[^\\d+]");
		
		for(String numString:numStringArray) {
			System.out.println(numString);
			 if(!numString.isEmpty()) {
		            total += Integer.parseInt(numString);
		        }
		    }
		    // Print the result
		    System.out.println("Total = " + total);
			}
		
	}


