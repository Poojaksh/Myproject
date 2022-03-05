package Javaprog;

public class floatdeci


{
	static float decimal(float d)
	{
		int b = (int)d;
		d -=b;
		return d;
	}
	public static void main(String[] args)
	{
	float a=(float) 21.12;
	System.out.println(decimal(a));
	}

}
