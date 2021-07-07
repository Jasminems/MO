/*Method Overloading with same name with different number of parameters with different data type*/
import java.io.*;
class Adder
{
	public int add(int a,int b)
	{
		int s=a+b;
		return s;
	}
	public double add(double a,double b,double c)
	{
		double s=a+b+c;
		return s;
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		Adder a1=new Adder();
		//calling the methods
		int s1=a1.add(1,5);
		System.out.println("Sum of 2 integers:"+s1);
		double s2=a1.add(11,22,33);
		System.out.println("Sum of 3 integers:"+s2);
		}
}
