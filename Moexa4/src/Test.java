/*Method Overloading with same name,number of parameters and data type with different return type*/
import java.io.*;
class Samp
{
	public int div(int a,int b)
	{
		int s=a/b;
		return s;
	}
	public int div(int a,int b)
	{
		double s=a/b;
		return s;
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		Samp a1=new Samp();
		//calling the method
		int s1=a1.div(10,2);
		System.out.println("Divide of 2 integers:"+s1);
		double s2=a1.div(15,2);//return double type
		System.out.println("Divide of 2 integers:"+s2);
	}
}