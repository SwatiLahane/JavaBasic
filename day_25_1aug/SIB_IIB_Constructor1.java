package day_25_1aug;

public class SIB_IIB_Constructor1 
{
	  {   //IIB
		   System.out.println("Inside IIB");
	  }
	
	  static  //SIB
	  {
		   System.out.println("Inside SIB");
	  }
	 SIB_IIB_Constructor1()
	 {
		 System.out.println("Inside Constructor");
	 }
	 
	 SIB_IIB_Constructor1(int a )
	 {
		 System.out.println("Inside Constructor 1");
	 }
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		
	   // if construct and IIb bth r present then IIB n constructor execute 
		//Same time when we create an object using class name
		
		new SIB_IIB_Constructor1();  //this will call IIB and COnstructor1
		new SIB_IIB_Constructor1(10); //this will call IIB and Parametherised Constructor
	}


}
