package Javaprog;

public class Addspace 
{
		public static void main(String[] args)
		{
			String s = "%s Hellow World!";
		    StringBuilder builder = new StringBuilder();
		    for(int i=0;i<10;i++)
		    {
		        builder.append(" ");
		    }
	
		    System.out.println(s.format(s,builder.toString()));
		}

}
