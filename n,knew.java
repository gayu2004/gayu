import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int N,K,i=1 ;
		
        int sum=0;
         Scanner s = new Scanner(System.in);
		System.out.println("");
       N=s.nextInt();
       System.out.println("");
        K=s.nextInt();
        while(i<=K)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(+sum);
	}
}
