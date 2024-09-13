package arrays;

public class CheckNumberPresent {

	public static void main(String[] args) {
		
		
		int Arr[] = new int[4];
		Arr[0] = 10;
		Arr[1] = 20;
		Arr[2] = 30;
		Arr[3] = 40;
		
		int NumberIs = 40;
		
		for(int i = 0; i < 4; i++)
		{
			if(Arr[i] == 10)
			{
				System.out.println("Number is Present at index "+Arr[i]);
			}
			else
			{
				System.out.println("Number is not present ");
			}
		}
		
		
	}

}
