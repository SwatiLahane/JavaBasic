package basicpackage;



public class Non_Static_Method 
{
    
	 public void Add()
	  {
		  int a = 10;
		  int b = 20;
		  int and = a+b;
		  System.out.println(and);
	  }
	  public void Sub()
	  {
		  int a = 10;
		  int b = 20;
		  int ans = a-b;
		  System.out.println(ans);
	  }
	  public void Multi()
	  {
		  int a = 10;
		  int b = 20;
		  int iRes = a*b;
		  System.out.println(iRes);
	  }
	  public static void main(String[] arg)
	  {   
		  //to call non static method
		  //by creating an object with the help of its reference variable
		  //we can call non static method
		  //Syntax ob creating object classname variable = new classname
		 
		  Non_Static_Method  nobj = new Non_Static_Method() ;
	      nobj.Add();
	      nobj.Sub();
	      nobj.Multi();
		  
	 	  
		  
	      
	  } 
}
