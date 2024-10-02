package practiceprograms;

public class ReverseString 
{
   public static void main(String args[])
   { 
	    String str = "Swati Vinayak Lahane ";
	    String rev = " ";
	    
	   
	    for(int i = 0; i < str.length(); i++)
	    	
	    {
	    	 char c1 = str.charAt(i);
	    	 
	         rev = c1 + rev;
	    }
	    
      System.out.println("Reverse String "+rev);
   }

}   
   