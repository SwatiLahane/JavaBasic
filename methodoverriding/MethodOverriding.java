package methodoverriding;

//Super keyword 
class Parent
{
	void login() //method is getting overriden
	{   
		
		System.out.println("Login using email id ");
	}
}
public class MethodOverriding extends Parent 

{
	
   void login()
   {   
	   //super keyword 
	  // super.login(); //to call Parent class overridden method
 	   
	   super.login();
	   System.out.println("Login Mobile No");
 	 
   }
   
   public static void main(String arg[])
   {
	   MethodOverriding mobj = new MethodOverriding();
	   mobj.login(); 
   }
}
