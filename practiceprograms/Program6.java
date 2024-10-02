package practiceprograms;
import java.util.*;

class Arithematic
{
	 public int a;//characteristics
	 public int b;
	 
	 
	public Arithematic(int ino ,int ino1) 
	 {
		 this.a = ino ;
		 this.b = ino1;
	 }
	 
	 public int Addition()
	 {  
		int iRes = 0;
	    iRes = a+b;
		return iRes; 
	 }

}


public class Program6 
{
       public static void main(String[] args)
	   {
		   Scanner sobj = new Scanner(System.in);
		  
		   
		  System.out.println("Enter First Number :");
		  int iValue = sobj.nextInt();
		  
		  System.out.println("Enter Second Number :");
		  int iValue1 = sobj.nextInt();
		  
		  Arithematic aobj = new Arithematic(iValue,iValue1);
		  int iAns = aobj.Addition();
		  
		  System.out.println("Addition is :"+iAns);
		  System.out.println(aobj.a);
		  System.out.println(aobj.b);
		  
	   }
		
	
}
