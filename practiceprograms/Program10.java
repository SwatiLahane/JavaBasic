package practiceprograms;

//Accept two numbers from user and perform addition of that numbers display result
import java.util.*;

public class Program10 
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
														   
		System.out.println("Enter First Number :");
		int ino = sobj.nextInt();
		
		System.out.println("Enter Second Number :");
		int ino1 = sobj.nextInt();
		
		int ians = ino + ino1;
		System.out.println("Addition is :"+ians);
													   
	}
}
