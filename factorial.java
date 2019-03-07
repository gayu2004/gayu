import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int num;
	 Scanner s=new Scanner(System.in);
	 num=s.nextInt();
        long factorial= 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial*=i;
        }
        System.out.printf("%d",factorial);
	}
}
