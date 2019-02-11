import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner s=new Scanner(System.in);
		 int count=0,num;
		 System.out.println("");
		 num=s.nextInt();
         while(num !=0)
        {
            num /= 10;
            ++count;
        }

        System.out.println(+ count);
	}
}
