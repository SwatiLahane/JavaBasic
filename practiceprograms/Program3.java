package practiceprograms;
import java.util.*;
//to accept input from user here we r using scanner class
public class Program3 
{
    public static void main(String args[])
    {   
    	
    	Scanner sobj = new Scanner(System.in);
    	
    	System.out.println("Enter How many times u want to print name on screen");
    	int ino = sobj.nextInt();
    	
    	for(int i = 1; i <= ino; i++)
    	{
    	   System.out.println("Jay Ganesh");
    	}
    } 
	
}
