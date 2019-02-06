import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			char a=' ';
		 Scanner s = new Scanner(System.in);
		a=s.next().charAt(0); 
		int n=(int)a;
		if(n>=65 && n<=122)
		{
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonent");
			}
      }
		else
	    {
			System.out.println("invalid");
			
		}
	}
}
