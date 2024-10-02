package practiceprograms;

import java.util.Scanner;

public class PracticeMath {

	public static void main(String[] args)
	{
	   Scanner sobj = new Scanner(System.in);	
	   System.out.println("Enter First value :");
	   int x  = sobj.nextInt();
	   
	   System.out.println("Enter Second value :");
	   int y  = sobj.nextInt();
	   
	   
	   System.out.println(Math.addExact(x, y));
	   

	}

	

}
