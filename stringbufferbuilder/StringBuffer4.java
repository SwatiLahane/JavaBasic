package stringbufferbuilder;

public class StringBuffer4 {

	public static void main(String[] args)
	{
		 //StringBuffer sobj1  = new StringBuffer("S");
		
	   StringBuffer sobj  = new StringBuffer("Testing with Swati");
	   StringBuffer sobj1 = new StringBuffer("Coding With Swati");
	   
	   int i = sobj1.capacity();
	   System.out.println(i);
	   
	   sobj.append(" Of Selenium");
	   System.out.println(sobj);
	   
	   
	   System.out.println(sobj.length()); 
	   
	   
	   System.out.println(sobj1.length());
	   
	   char ch = sobj.charAt(0);
	   System.out.println(ch);
	   
	   sobj.delete(0, 7);
	   System.out.println(sobj);
	   
	   sobj.reverse();
	   System.out.println(sobj);
	   
	   sobj1.replace(0, 4, "seed");// 4-1 (0 to 3) seed
	   System.out.println(sobj1);
	   
	   char ch1 = sobj.charAt(0);
	   System.out.println(ch1);
	   
	   sobj1.delete(7, 11);
	   System.out.println(sobj1); 
	   
	  // sobj1.ensureCapacity(80);
	   
	   int i1 = sobj1.capacity();
	   System.out.println(i1);
	   
	   
	    
	   

	}

}
