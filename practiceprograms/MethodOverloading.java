package practiceprograms;

public class MethodOverloading {
	
	 void add(int a)
	 {
		 System.out.println("Inside Add Method with argument ");
	 }
	 int add()
	 {
		 System.out.println("Inside Add method without arguments");
		 return 0;
	 }
	

	public static void main(String[] args) 
	{
		MethodOverloading sob = new MethodOverloading();
		
       sob.add();
       sob.add(10);
	}

}
