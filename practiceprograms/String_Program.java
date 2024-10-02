package practiceprograms;

public class String_Program {

	public static void main(String[] args)
	{
	 
	    String str = "123";
	
	    String rev = "";
	    //String rev = " " ;//It will print else value because of space in double quote 
	    //so we have to remove space then we get madam45
	    
	   
	    for(int i = str.length()-1; i >= 0; i--)
	    {
	    	char ch = str.charAt(i);
	    	rev = ch + rev;
	    }
	    
	    if(str.equals(rev))
	    {
	    	System.out.println("Madam45");
	    }
	    else
	    {
	    	System.out.println("Madam12");
	    }
	}

}
