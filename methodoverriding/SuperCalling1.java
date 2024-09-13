package methodoverriding;

class Youtube
{    
	Youtube()
	{
		//super
		System.out.println("YouTube");
	}
}
	class Google1 extends Youtube
	{ 
		Google1()
		{
			//super   
			System.out.println("Google1");
		}
	}

public class SuperCalling1 extends Google1
{
	SuperCalling1()
     {   
		 //super 
    	 System.out.println("SuperCalling1");
     }
	public static void main(String arg [])
	{
		 new SuperCalling1();
	}
}
