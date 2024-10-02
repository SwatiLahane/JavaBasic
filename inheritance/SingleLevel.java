package inheritance;

class Amazon
{
	static void loginwithmobileno()  //static method we call directly by using method name
	{
		System.out.println("Mobile No");
	}
	void Registration() //non static mthod we hav to create an objet
	{
		System.out.println("Registration no");
	}
}



public class SingleLevel extends Amazon 
{
	static void loginwithemailid()
	{
		System.out.println("Email id");
	}
	void logout()
	{
		System.out.println("logout");
	}
	
	
     //where the class is availble in package that is only sub class or child class
	public static void main(String[] args)  //	SUB CLASS 
	{ 
		
		loginwithmobileno();
		loginwithemailid();
		//here we extend parent class thats why we create object of SingleLevel inheritance
		//to class Another class method
		//but in other class we have to create same class object to call same class method
		
		SingleLevel sobj =new SingleLevel(); //
		
		sobj.Registration();
		sobj.logout(); 
		

	}

}
