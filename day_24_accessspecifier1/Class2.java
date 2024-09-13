package day_24_accessspecifier1;

import day_24_accessspecifier.Class1;

public class Class2  extends Class1
{
	
	public static void main(String[] args) 
	{   
	  Class1 c1 = new Class1();
	  c1.method1(); //public 
	  c1.Method3();//protected
	}

}
