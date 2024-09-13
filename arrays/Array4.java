package arrays;
import java.util.*;

public class Array4 
{
    public static void main(String arg[])
    {
    	
    	Scanner sobj = new Scanner(System.in);
    	boolean b[]  =new  boolean [2];
    	
    	System.out.println("enter Value :");
    	for(int i = 0; i < b.length; i++)
    	{
    	    b[i] = sobj.nextBoolean();
    	    
    	}
    	System.out.println(Arrays.toString(b));
    	
    	
    	
    	
    	
    }
}
