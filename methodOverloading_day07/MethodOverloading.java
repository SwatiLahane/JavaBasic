package methodOverloading_day07;


public class MethodOverloading {
        
	static void Add() //static method
	  {
		  
		  System.out.println("1");
	  }
	   void Add(int a)  //nonstatic method
	  {   
		  System.out.println("2");
		  System.out.println(a);
		  
	  }
	  static void Add(String a)  //static method
	  {   
		  System.out.println("3");
		  System.out.println(a);
		  
	  }
	   static void Add(String a, char b,double c) //static method
	   {
		  System.out.println("4");
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(c);
		 
		 
		 
	   }
	   static  void Add(boolean c)
	   {
		  System.out.println(c); 
	   }
	 
	

	public static void main(String[] args) 
	{
		MethodOverloading mobj = new MethodOverloading();
		
		  Add();
		  Add(true);
		  mobj.Add(20);
		  Add("Swati");
		  Add("Swati",'S',10.23);

	}

}
