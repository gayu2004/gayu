/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s=new Scanner(System.in);
	 int r,sum=0,temp,n;
    System.out.println("");
    n=s.nextInt();
     int arr[]=new int[1000];
    temp=n;
    while(n>0)
    {    
    r=n%10;    
    sum=(sum*10)+r;    
    n=n/10;    
   }    
   if(temp==sum)    
  {
   System.out.println("yes");    
  }
  else 
  {
   System.out.println("no");    
  }  
}  
}	
	
