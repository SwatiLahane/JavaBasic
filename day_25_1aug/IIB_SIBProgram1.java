package day_25_1aug;
   
//We can write SIB and IIB in one Program 
public class IIB_SIBProgram1 
 {   
		
		{     //IIB   //n after main method IIB will execute
			System.out.println("Inside IIB");
		}
	    
		static //SIB     //first sib execute
		{
			System.out.println("Inside SIB");
		}
		public static void main(String[] args)  //then after sib Main method will execute
		
		{
			//But Output sequence will change
			
			//System.out.println("Main Method");
		new  IIB_SIBProgram1();  //object creating when we crete an object first IIB gets Called and then Constructor gets called
			
		System.out.println("Main Method"); 
			 
		}

}
