package loop;

public class ForLoopExample {

	public static void main(String[] args) throws InterruptedException
	{
		   //     1        2      3
		 for(int i = 1;  i <= 5;  i++)
		 {    
			 Thread.sleep(2000);
			 System.out.println("Jay Ganesh"); //4
		 }

	}

}
