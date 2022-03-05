package Javaprog;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args)
	{
		String str = "pooja dhumal"; 
		
		char[] a = str.toCharArray(); 
		Set setl=new LinkedHashSet ();
		
		for(char b:a)
		{
			setl.add(b);
		}
		
		for(Object s:setl)
		{
			System.out.println(s);
			
		}
	}

}
