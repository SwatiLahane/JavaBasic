package arrays;

public class Exam_Array_Program1 {

	public static void main(String[] args) 
	{
		
      try
      {
    	  int [] number = {1,2,3};
    	  System.out.println("Element At index 3: "+number[3]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
    	  System.out.println("Error");
      }
	}

}
