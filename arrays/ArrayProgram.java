package arrays;

//check no 66 is present  not
public class ArrayProgram {

	public static void main(String[] args) {
	
		int []rollno = new int[5];
		rollno[0] = 12;
		rollno[1] = 21;
		rollno[2] = 23;
		rollno[3] = 43; 
		rollno[4] = 33;
		
		int givennumber = 43;
		
		for(int i = 0; i < rollno.length; i++)
		{
			if(givennumber == rollno[i])
			{
				System.out.println("Given number is a part of array ,at the index position = "+i);
			}
			else
		    
			{
			   System.out.println("Sorray not found");
		    }
		
	     }

	}
}	
