package typecasting_27day;

import java.util.Scanner;

public class ClassTypeCasting  
{

	public static void main(String[] args) {
		
		//Upcasting 
		//object is Parent class/ super class
		//Converting the child class object into super class
		Object b1 = new ClassTypeCasting();
		
		//if i do b1. it will show all the methods of object class
		
		
		b1.hashCode();// these are the object class methods or properties
		
		
		Scanner  sobj = new Scanner(System.in);
		sobj.nextInt(); //properties or methods of scanner class
	
	}

}
