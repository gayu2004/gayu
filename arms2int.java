import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int l,h;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		h=s.nextInt();
       for(int n=l+1; n<h; ++n)
       {
            int digits = 0;
            int result = 0;
            int on = n;

            
            while (on!= 0) 
            {
                on/= 10;
                ++digits;
            }

            on= n;

            
            while (on!= 0) {
                int rem = on % 10;
                result += Math.pow(rem, digits);
                on/= 10;
            }

            if (result == n)
                System.out.print(n+"");
            }
       }
   }
