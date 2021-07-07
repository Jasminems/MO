/*Method Overloading with same name with same number of parameters with same type*/
import java.io.*;
class Adder
{
	//2methodswith same name with same number of parameters with same data type
	public int add(int a,int b)
	{
		int s=a+b;
		return s;
	}
	public int add(int a,int b)
	{
		int s1=a+b;
		return s1;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Adder a1=new Adder();
		//calling the methods
		int s2=a1.add(2,3);
		System.out.println("Sum of 2 integers:"+s2);
		int s2=a1.add(10,20,30);
		System.out.println("Sum of 3 integers:"+s2);
		}
}