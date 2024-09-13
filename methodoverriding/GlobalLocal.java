package methodoverriding;

public class GlobalLocal {
	
	static int a = 30;  //
	int age;
	double salary;
	String name ;
	
	void employee_details(int age ,double salary,String name)

	{
		System.out.println("Age is "+age);
		System.out.println("Salary is"+salary);
        System.out.println("Name is "+name);
	}

	public static void main(String[] args)
	{
		GlobalLocal gobj = new GlobalLocal();
        gobj.employee_details(87, 8.23, "Ramu");
      //  System.out.println(gobj.salary);
        //System.out.println(gobj.age);
        //System.out.println(gobj.name);
       
        System.out.println(a); //we cancall global characteristics directly 
       
	}

}
