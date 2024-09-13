package methodoverriding;

public class ThisKeyWord {

	
		int age; //0
		String name ;//null //default values ofglobel variable
		double salary;//0.0
		
		
		void employee_details(int age ,String name,double salary)

		{   
			this.age = age;
			this.name = name;
			this .salary = salary;
		}
		
		public static void main(String[] args) 
		
		{
			ThisKeyWord tobj = new ThisKeyWord();
	        tobj.employee_details(87, "Ramu",3.2);
	        System.out.println(tobj.age);
	        System.out.println(tobj.name);
	        System.out.println(tobj.salary);
	       
		}

	}

