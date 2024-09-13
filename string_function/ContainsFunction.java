package string_function;

import java.util.Arrays;

public class ContainsFunction {

	public static void main(String[] args) {
		
		//conatains
		String s1 = "Swati vinayak Lahane ";
		boolean ans = s1.contains("Lahane");
		System.out.println(ans);
		
		
		//split with one parameter
		String[]  name = s1.split(" ");
		
		//to get array ans in single line
		
        System.out.println(Arrays.toString(name));
        
        //Split function with two parameter
        
        String[] name1 = s1.split(" ", 2);
        System.out.println(Arrays.toString(name1));
        
        //repeat function
          
        //this will not work on jre version 1.8 
        String s2 = "School"; 
       /* System.out.println(s2.repeat(4));
        //it will print repeat 4 times
        */  
        
        //Ends With h or not
        String s3 = "Manish";
        System.out.println(s3.endsWith("h"));
        
        //isEmpty
       // String s4 = "A";
        String s5 = "";
        System.out.println(s5.isEmpty());
        
	}

}
