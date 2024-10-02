package practiceprograms;

public class EqualsIgnore
{  
	public static void main(String arg[])
	{
		//equals ignore function will ignore the capital or small letter it will only check the string is equal or not
		
		String s1 = "Swati";
		String s2 = "swati";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String a = "Saavi";
		String b = "SAAVI";
		
		System.out.println(a.equalsIgnoreCase(b));
		
		
		String c1 = "AArav";
		String c2 = "Shreenika";
		
		System.out.println(c1.equalsIgnoreCase(c2));
		
	    
		
		
	}

}
