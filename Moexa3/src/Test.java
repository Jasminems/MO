/*Method Overloading with same name with same number of parameters with different type*/
import java.io.*;
class Adder
{
	int add(int a,int b)
	{
		int s=a+b;
		return s;
	}
	double add(double a,double b)
	{
		double s=a+b;
		return s;
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		Adder a1=new Adder();
		//calling the method
		int s1=a1.add(1,2);
		System.out.println("Sum of 2 integers:"+s1);
		double s2=a1.add(1,2);
		System.out.println("Sum of 2 integers:"+s2);
	}
}
