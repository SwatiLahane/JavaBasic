package inheritance;

class Arithematic 
{    
	//public int A;
	//public int B;
	
	static void  Fun()
	{
		
	    System.out.println("Inside Fun of Super class ");
	   
	}
	 void gun()
	{
		System.out.println("Inside gun of Super class ");
	}
	
}


public class SingleInheritance1 extends Arithematic 
{
	static void mun()
	{
		
		System.out.println("Inside Mun of Sub class");
	}
	
	
   public static void main(String arg[])
   {
	   Fun();
	   SingleInheritance1 sobj = new SingleInheritance1();
	   sobj.gun();
	   mun();
	   
   }
}
