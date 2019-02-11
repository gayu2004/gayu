import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int base,exponent;
		System.out.println("");
		base=s.nextInt();
		System.out.println();
		exponent=s.nextInt();
        long result=1;
        while (exponent!= 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println( + result);
    }
	}
