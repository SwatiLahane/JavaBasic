package day_25_1aug;

public class SIIB_IIB_Constructor {

	 static
	 {
		 System.out.println("Inside SIB");
	 }
	 
	 {
		 System.out.println("Inside IIB ");
	 }
	 
	 SIIB_IIB_Constructor(int i)
	 {
		 System.out.println("Inside Constructor");
	 }
	
	
	public static void main(String[] args)
	{
	    
		System.out.println("Inside Main Method");
		
		new SIIB_IIB_Constructor(20);
		
	}
	
}
