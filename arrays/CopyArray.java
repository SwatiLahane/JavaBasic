package arrays;

import java.util.Arrays;
//how to copy the one array into another array
import java.util.Scanner;

public class CopyArray 
{
    public static void main(String arg[])
    {
    	//Scanner sobj = new Scanner(System.in);
         double Esalary[] = new double[3];
         Esalary[0] = 7185.23;
         Esalary[1] = 7485.23;
         Esalary[2] = 7885.23;
         
         double Msalary[] = new double[3]; 
          
        /* Msalary[0] = Esalary[0]; //Assignning the value of Esalary to Masalary
         Msalary[1] = Esalary[1];
         Msalary[2] = Esalary[2]; */
         
         for(int i =0 ; i < Esalary.length; i++) //by using for loop
         {
        	 Msalary[i] = Esalary[i];
         }
         
         System.out.println("old array :");
         System.out.println(Arrays.toString(Esalary));
         System.out.println("After coping the new is :");
         System.out.println(Arrays.toString(Msalary));
         
        
    	
    }
}
