package scannerclass;
import java.util.*;
public class AreaOfCircle 
{
   
	
	//global variable is inside the class and which is accessible to all the methods
	final static double pi = 3.14; 
	
	

public static void main(String arg[])
{ 
	 Scanner sobj = new Scanner(System.in); 
	  
	 System.out.println("Enter Radius :");
	 int dradius  = sobj.nextInt();
	 
	 double area = pi* dradius * dradius;
	 System.out.println("Area of circle is "+area);
	 sobj.close();
}
	
	
	
}
