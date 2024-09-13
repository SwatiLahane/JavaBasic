package string_function;

public class TrimFunction {

	public static void main(String[] args) 
	 {
		 //trim function removes the space from starting of the string and ending of the string
		 //but not from middle of the string 
		
         String a = " Swati Vinayak Lahane  ";
         String b = "      Swati vinayak Lahane"; //here we put space after trim it will see 
         //like first string
         
         System.out.println(a.trim());
         System.out.println(b.trim());
         
         String s1 = "Shreenika Balu Lahane ";
         String s2 ="    Shreenika Balu Lahane";
         
         System.out.println(s1.trim());
         System.out.println(s2.trim());
         
         String c1 = "  Aarav Balu Lahane ";
         String c2 = "Aarav Balu Lahane    ";
         
         System.out.println(c1.trim());
         System.out.println(c2.trim());
         
         String str = " Saavi vikas Jadhav ";
         System.out.println(str.trim());
	}

}
