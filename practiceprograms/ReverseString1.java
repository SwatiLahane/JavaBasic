package practiceprograms;

public class ReverseString1 
{
    public static void main(String arg[])
    {
    	//String str = "Swati";
    	String str = "MOM";
    	String rev = "";
    	
    	
    	
    	for(int i = str.length()-1; i >= 0; i--)
    	{   
    		char ch = str.charAt(i);
    		rev = rev + ch;
    	}
    	
    	System.out.println("Reverse String "+rev);
    	
    	if(str.equals(rev))
    	{
    		System.out.println("String is palimdrom");
    	}
    	else 
    	{
    		System.out.println("String is not palimdrom");
    	}
    }
}