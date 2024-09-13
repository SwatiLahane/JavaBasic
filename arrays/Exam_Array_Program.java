package arrays;

public class Exam_Array_Program {

	public static void main(String[] args) {
		
		
		int[] number = {3,7,9,2,4};
        int sum = 0;
        
        for(int i=0; i < number.length; i++ )
        {    
      	  if(number [i] % 2 == 0)
      	  {
      		  sum = sum + number[i];
      	  }
      	 
        }
        System.out.println(sum);
	}

	}


