/*Method Overloading with same name with different no.of parameters with same type*/
import java.io.*;
class Adder
{
	//2methods
	public int add(int a,int b)
	{
		int s=a+b;
		return s;
	}
	public int add(int a,int b,int c)
	{
		int s=a+b+c;
		return s;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Adder a1=new Adder();
		//calling the methods
		int s1=a1.add(2,3);
		System.out.println("Sum of 2 integers:"+s1);
		int s2=a1.add(10,20,30);
		System.out.println("Sum of 3 integers:"+s2);
		}
}
