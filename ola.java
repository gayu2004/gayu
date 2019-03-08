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
	String name,email;
	int num;
	float source=1,destination,km,amnt;
	String ch;
	name=s.nextLine();
	email=s.nextLine();
	num=s.nextInt();
	source=s.nextFloat();
	destination=s.nextFloat();
	km=destination-source;
	System.out.println(""+km);
	ch=s.next();
	if(ch=="auto")
	{
		amnt=km*10;
		System.out.println("auto"+amnt);
	}
	else if(ch=="mini")
	{
		amnt=km*15;
		System.out.println("mini"+amnt);
	}
		else if(ch=="autoac")
	{
		amnt=km*100;
		System.out.println("autoac"+amnt);
	}
	else if(ch=="cab")
	{
	
		amnt=km*200;
		System.out.println("cab"+amnt);	
	}
		else if(ch=="accab")
	{
	
		amnt=km*220;
		System.out.println("accab"+amnt);	
	}
	else
	{
		System.out.println("No option");
	}
	System.out.println("name:"+name);
		System.out.println("email:"+email);
			System.out.println("phno:"+num);
				System.out.println("source:"+source);
					System.out.println("destination:"+destination);
						System.out.println("");
	}
}
