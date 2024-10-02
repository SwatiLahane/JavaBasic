package inheritance;

class One
{
	static void add()
	{
		System.out.println("1");
	}
}	
class Two extends One 
{
   	static void sub()
   	{
   	   	System.out.println("2");
   	}
}


public class Multilevel extends Two
{
    static void Mult()
    {
    	System.out.println("3");
    }
    
    public static void main(String arg[])
    {
    	add();
    	sub();
    	Mult();
    }
}
