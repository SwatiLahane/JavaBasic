package methodOverloading_day07;

public class MethodOverloading3 
{
	
	
	public int Add(int a ,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,double b)
	{
		return a + b;
	}

	public static void main(String[] args) 
	{
		MethodOverloading3 mobj =new MethodOverloading3();
		System.out.println(mobj.Add(5, 5));              //Output :10
		System.out.println(mobj.add(10, 5, 5));          //Output :20
		System.out.println(mobj.add(10.10, 20.20));      //Output :30.299999999999 
		
	}

}
 