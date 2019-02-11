import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
