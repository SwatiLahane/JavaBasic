package practiceprograms;

import java.awt.Checkbox;
import java.util.*;

//prime number
class Arithematic 
{
	public boolean CheckPrime(int iNo) 
    {
        int prime = 0;
        int iCnt = 0;
       
        if(iNo < 0) 
         {
            iNo = -iNo;
         }

        for(iCnt = 2; iCnt <= (iNo-1); iCnt++)
        {
            if(iNo % iCnt == 0)
            {

               return false;
            }
        }
        
        if(iNo == iCnt)
        {
        return true;
        }
		return false;
        
    }
}

public class Program7 
{  
   
   
   public static void main(String args[])
   {
	   Scanner sobj = new Scanner(System.in);
	   System.out.println("Enter Number :");
	   int ino = sobj.nextInt();
	  
	   boolean bret = CheckPrime(ino);
	   
	   if(bret == true)
	   {
		   System.out.println("Number is Prime");
	   }
	   else
	   {
		   System.out.println("Number not Prime");
	   }
	 }


}

