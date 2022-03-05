package Javaprog;

public class Duplicate2 {
//
//	public static void remov(String str) 
//	{
//		String s=new String();
//		int length=str.length();
//		for (int i=0;i<length;i++)
//		{
//			char charAtPosition=str.charAt(i);
//			if(s.indexOf(charAtPosition)<0)
//			{
//				s+=charAtPosition;
//			}
//		}
//		System.out.println(s);
//	}
//	public static void main(String [] args)
//		{
//			String str="Pooja";
//			remov(str);
//		}
	public static void main(String[] args)
	{
	String str = "pooja"; 
	
	char[] a = str.toCharArray(); 
	//int cnt=0;
	String str1 = ""; 
	for (int i = 0; i < a.length; i++) 
	{ 
		if (!str1.contains("" + a[i])) 
		{ 
			str1 = str1 + a[i]; 
			
		}
		//else
			//cnt++;
	} 
			
	System.out.println(str1);
	}
}


