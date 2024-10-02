package day23_31Jul;

//One class Can impliment multiple interfaces
//Interface class relation Implements keyword


interface Demo
{
	void fun();
}
 
interface Hello
{
	void Gun();
}

 
 
public class InterafaceDemo1  implements Demo,Hello
{
	
	 public void fun()
	 {
		 System.out.println("Inside Fun Method ");
	 }
	 public void Gun()
	 {
		 System.out.println("Inside gun Method");
	 } 

	public static void main(String[] args)
	{
	     InterafaceDemo1 sobj = new InterafaceDemo1();
		
		sobj.Gun();
		sobj.fun();
          
	}
	
	
			
	

}
