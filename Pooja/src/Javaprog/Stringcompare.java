package Javaprog;

public class Stringcompare {

	public static void main(String[] args) 
	{
		System.out.println("In java String comaprision in 3 ways::--");
		   String s1="Rishi";  
		   String s2="rishi";  
		   String s3=new String("Rishi");  
		   String s4="Pooja";  
		   System.out.println("           ");
		   System.out.println("By using equals() method :-");
		   System.out.println(s1.equals(s2)); 
		   System.out.println(s1.equals(s3));  
		   System.out.println(s1.equals(s4));
		   System.out.println("           ");
		   System.out.println("By using equals() method and ignore uppercase :-");
		   System.out.println(s1.equalsIgnoreCase(s2));
		   System.out.println("           ");
		   System.out.println("By using compareTo() method :-");
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));
		   System.out.println("           ");
		   System.out.println("By using == operator :-");
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);
	}

}
