package arrays;

import java.util.Arrays;

public class CopyArray1 {

	public static void main(String[] args)
	{
		
		
		int Arr[] = new int[3];
		
		Arr[0] = 10;
		Arr[1] = 20;
		Arr[2] = 30;
		
		int Brr[] = new int[3];
		
	/*	Brr[0] = Arr[0];
		Brr[1] = Arr[1];
		Brr[2] = Arr[2];
		*/
		
		for(int i = 0; i < Arr.length; i++)
		{
			Brr[i] = Arr[i];
		} 
		
		System.out.println("Old Array ");
		System.out.println(Arrays.toString(Arr));
		System.out.println("New Array");
		System.out.println(Arrays.toString(Brr));
		
		
		
		
		
		
		
		
	}

}
