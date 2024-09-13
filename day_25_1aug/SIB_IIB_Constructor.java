package day_25_1aug;

public class SIB_IIB_Constructor 
 {
	  {   //IIB -instance initialization block
		   System.out.println("Inside IIB");
	  }
 	
 	  static  //SIB -static inittialization block
	  {
		   System.out.println("Inside SIB");
	  }
 	 SIB_IIB_Constructor()
 	 {
 		 System.out.println("Inside COnstructor");
 	 }
 	 
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		
		new SIB_IIB_Constructor(); 
		new SIB_IIB_Constructor(); // It will Call Again IIB and Constructor
	}

}
