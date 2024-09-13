 package string_function;

public class MatchesFunction {

	public static void main(String[] args) 
	{
		String a = "ramu";
		 System.out.println(a.matches("r(.*)"));  //this operator called multi character search
		 
		 System.out.println(a.matches("....")); //dot means dash dash in SQL
		 
		 System.out.println(a.matches("(.*)u"));
		 
		 
		 System.out.println(a.matches("(.*)m(.*)"));
	}

}
