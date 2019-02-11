/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp,num;
	boolean Prime=true;
	Scanner s= new Scanner(System.in);
	System.out.println("");
	 num=s.nextInt();
	 int arr[]=new int[1000];
        s.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      Prime=false;
	      break;
	   }
	}

	if(Prime)
	{
	   System.out.println("yes");
	}
	else
	{
	   System.out.println("no");
	}
	}
}
