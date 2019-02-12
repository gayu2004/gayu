import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		  int l,h;
		  System.out.println("");
		  l=s.nextInt();
		  System.out.println("");
		  h=s.nextInt();
		  while (l< h) 
		  {
            boolean flag = false;

            for(int i = 2; i <= l/2; ++i) 
            {
                 if(l% i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(l + "");
                ++l;
        }
	}
}
