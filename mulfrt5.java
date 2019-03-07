import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int mul=0;
		int cn=1;
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		do {
			if(cn% n== 0) {
				mul++;
				System.out.print(""+cn);
			}
			cn++;
		} while(mul<5);
	}
}
