package basicpackage;



public class StaticNon_StaticMethods
{
	static void Add()
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
	  
	  static public void main(String[] arg) //main method sequence dnsnt matter in java
	  {
		  
		  StaticNon_StaticMethods nobj = new StaticNon_StaticMethods();
	      Add();
	      nobj.Sub();
	      nobj.Multi();
		  
	  }

}
