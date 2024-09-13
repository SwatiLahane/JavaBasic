package arrays;

public class Array_Program 
{
	//the given number 66 is present or not in an array
	
   public static void main(String args[])
   {
	   int []rollno = new int[5];
	   rollno[0] =12;
	   rollno[1] =21;
	   rollno[2] =23;
	   rollno[3] =43;
	   rollno[4] =33;
	   
	   int givennumber = 12;
	   
	   for(int i = 0; i < rollno.length; i++)
	   {
		   if(givennumber == rollno[i])
		   {
			   System.out.println("GIven number is a part of the Array ,at the index position = 1");
		   }
		   else
		   {
			   System.out.println("Sorry not found");
		   }
	   }
	   
   }
}
