package practiceprograms;

public class String_Program1 {

	public static void main(String[] args)
	{
	    
		String str = "121";
		//String rev = " ";//Becz of space it executed else part only 
		//so we have to remove space from double quote 
		
		String rev =""; //now it will execute if part
		
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		
        if(str.equals(rev))
        {
        	System.out.println("madam45");
        }
        else
        {
        	System.out.println("madam12");
        }
		 
		
	}

}
