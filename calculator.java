import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
 public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		float a,b,c;
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		a=s.nextFloat();
		System.out.println("enter b value:");
		b=s.nextFloat();
		System.out.println("enter your choice:");
		choice=s.nextInt();
	    if(choice==1)
		{
			c=a+b;
			System.out.println("addition"+c);
		}
		else if(choice==2)
		{
			c=a-b;
			System.out.println("subtraction"+c);
		}
		else if(choice==3)
		{
			c=a*b;
			System.out.println("multiply:"+c);
		}
		else if(choice==4)
		{
			if(b!=0)
			{
				c=a/b;
	    	System.out.println("divide"+c);
			}
			else
			{
			System.out.println("infinity");
				}
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
