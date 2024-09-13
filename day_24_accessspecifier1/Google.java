package day_24_accessspecifier1;

import day_24_accessspecifier.Class1;

public class Google {

	public static void main(String[] args) 
	{
		       
             Class1 c1 = new Class1();
             c1.method1();  //public 
             
             
	} 

}

//here we can only access public method 
//if we are dealing with outside the package we have to import it 

//outside the package without being subclass
//we need to create object 