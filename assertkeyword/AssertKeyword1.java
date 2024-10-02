package assertkeyword;

public class AssertKeyword1 {
     
	 
	//Syntax 2 assert condition("Message")
	//we have to enable assertion by right click->run configuration ->argument->
	//->vm-> add -ea  (for every program)
	
	public static void main(String[] args) 
	{
          
          int a = 10;
          String b = "manish";
          //assert b.equals("Manish");
         // assert a==7 :("Sorry condition is wrong");
          
         //  assert a==10 :("Sorry condition is wrong");
          
          //System.out.println(a+100);
          assert b.length() == 6;
          assert a > 7;
          System.out.println(a+100);
	}

}
