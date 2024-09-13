package arrays;
import java.util.*;
public class Array1 {

	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
	   Scanner sobj = new Scanner(System.in);
	     
	   System.out.println("Enter Numbers :");
	    for(int i = 0; i < rollno.length; i++)
	    {
	    	rollno[i] = sobj.nextInt();
	    	
	    }
           
	    System.out.println(Arrays.toString(rollno));  //to print an array in single  line 
         
	}

}
