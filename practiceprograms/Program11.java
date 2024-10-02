package practiceprograms;


import java.util.*;

 class Apple
{
	
	public int Addition(int iValue ,int ivalue1)
	{
		int ires = ivalue1 + iValue;
		
		return ires;
		
	}
	
}

public class Program11 
{
   
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		Apple aobj = new Apple();
		
		System.out.println("Enter First Number :");
		int ino = sobj.nextInt();
		
		System.out.println("Enter Second Number :");
		int ino1 = sobj.nextInt();
		
		int iAns = aobj.Addition(ino, ino1);
		System.out.println("Sum is "+iAns);
		
	}
	
}
