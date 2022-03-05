package Javaprog;


import java.util.Scanner;

public class MaximunNthNumber {
	public static void main(String[] args) 
	{

		int number,maxnum;
		Scanner scan = new Scanner(System.in); 
		{
			System.out.println("Enter how many number wants to enter: ");
			number=scan.nextInt();
			int a[]=new int [number];
			System.out.println("Enter values: ");
			for(int i=0;i<number;i++)
			{
				a[i]=scan.nextInt();
			}
			maxnum = a[0];
			for(int i=0;i<number;i++)
			{
				if(maxnum<a[i])
				{
					maxnum=a[i];
				}
			}
		
		System.out.printf("maxinum number is :="+maxnum);
	}
 }
}
		



