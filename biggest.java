import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("");
		a=s.nextInt();
		System.out.println("");
		b=s.nextInt();
		System.out.println("");
		c=s.nextInt();
		
		if( a >= b && b >= c)
		{
            System.out.println(a);
		}

        else if (a >= a && b >= c)
        {
            System.out.println(b);
        }
        else
           {
           	System.out.println(c);
           }
	}
}
