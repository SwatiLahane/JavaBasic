package arrays;
import java.util.*;

//need correction
public class Array2 
{
    public static void main(String arg[])
    {
    	String name[] = new String[3];
    	
    	Scanner sobj = new Scanner(System.in);
        
    	System.out.println("Enter Name :");
    	for(int i = 0; i < name.length; i++)
    	{
    		name[i] = sobj.nextLine();
    	}
    	
    	System.out.println(Arrays.toString(name));
    	
    }
}
