package arrays;

public class StringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sb1 = new StringBuilder("Swati");
		
		 String str = "Java";
		 String s2 = "Programming";
		 
		 str.concat(s2);
		 System.out.println(str);
		
		
		 sb1.append(" Java");
		 System.out.println(sb1);
		 
		// sb1.delete('S', 1);
		 sb1.deleteCharAt(0);
		 System.out.println(sb1);
	}

}
