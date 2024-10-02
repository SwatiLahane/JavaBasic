package assertkeyword;

public class Assert_Keyword
{
      //Syntax 1 Example 
	  //syntax : assert condition; //condition comaprision operator
	
	public static void main(String[] args)
	{     
		 int a = 10;
		// assert a==11;   //It will give Assertion error 
		 assert a > 5;
		 System.out.println(a+100);
		 
		// int c =10;
		 String b = "manish";
		 assert b.length()==6;
		 System.out.println(a+100);
		 
		 String c = "manish";
		 assert b.equals("Manish");
		 System.out.println(a+100);
		 
		 
	}

}
