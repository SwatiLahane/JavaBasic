package practiceprograms;

public class ReverseString2 {

	public static void main(String[] args) {
		
		  
		String s  = "Saavi";
		
		String rev = "";
		
		for(int i = 4; i >= 0 ; i--)
		{
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		
		System.out.println("Reverse String is "+ rev);
		
		

	}

}
