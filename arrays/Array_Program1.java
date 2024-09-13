package arrays;

import java.util.Arrays;
       //Sort Arrays
public class Array_Program1 
{
    public static void main(String arg[])
    {
    	String names[]  = new String[3];
    	names[0] = "venkata";
    	names[1] = "Arvind";
    	names[2] =  "Rupa" ;
    	
    	System.out.println(names);
    	
    	int rollno[] = new int[4];
    	rollno[0] = 78;
    	rollno[1] = 74;
    	rollno[2] = 56;
    	rollno[3] = 44;
    	
    	Arrays.sort(rollno);
    	System.out.println(rollno);
    }
}
