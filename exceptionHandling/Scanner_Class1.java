package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Your Age ");
		
		try
		{
		   int age = sobj.nextInt();
		}
		
		catch(InputMismatchException a)
		{
			System.out.println("Sorry , please read the quetion");
			Scanner sobj2 = new Scanner(System.in);
			System.out.println("Enter Your age");
			int age1 = sobj2.nextInt();
			
		}
			System.out.println("Enter Your Firstname ");
			Scanner s3 = new Scanner(System.in);
			String  firstname =s3.nextLine();
			
		
		
		
	}

}
