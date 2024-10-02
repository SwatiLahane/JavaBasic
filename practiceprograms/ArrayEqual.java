package practiceprograms;

import java.util.Arrays;

public class ArrayEqual {
     
	//how to check two arrays are equal or not 
	
	public static void main(String[] args)
	{
	     int rollno[]  = new int [4];
	     int rollno1[] = new int [4];
	     
	     rollno[0] = 1;
	     rollno[1] = 2;
	     rollno[2] = 3;
	     rollno[3] = 4;
	     rollno1[0] = 1;
	     rollno1[1] = 2;
	     rollno1[2] = 3;
	     rollno1[3] = 4;
	     
	     
	     boolean b1 = Arrays.equals(rollno , rollno1);
	      System.out.println(b1);
	    		 
	      

	}

}
