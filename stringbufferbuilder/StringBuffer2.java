package stringbufferbuilder;

public class StringBuffer2 {

	public static void main(String[] args) 
	{
	   
		
		StringBuffer sobj = new StringBuffer("Swati"); //original String
		
		sobj.append( " Lahane"); //Modify String
		System.out.println(sobj);
		
		
		
		/* o/p 
		    
		   Swati Lahane  
		   
   String will append here because String buffer is muttable in nature 
		    
   In String there is concat method 		   
		
       */
	}

}
