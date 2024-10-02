package methodOverloading_day07;

public class Nethod_Overloading4 {

	
	public void add(int a ,int b)
	{
		System.out.println("Inside add method int ");
		int ans = a + b;
		System.out.println(ans);
		
	}
	public void add(double a, double b)
	
	{
		   System.out.println("Inside add method of double");
		   double ans1   = a + b;
		   
		   System.out.println(ans1);
		   
	}
	
	public double add(int a ,double b,double c)
	{
	    double ans2 = a + b +c ;
		return ans2;
	}
	
	public static void main(String[] args)
	{
		
		Nethod_Overloading4 aobj = new Nethod_Overloading4();
		aobj.add(10, 20);
		aobj.add(1.223, 3.455);
		double dret = aobj.add(12, 3.222, 4.566);
		System.out.println("Addition is :"+dret);
	  	
	}
	

}
