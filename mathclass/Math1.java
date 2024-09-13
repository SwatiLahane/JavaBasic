package mathclass;

public class Math1 {

	public static void main(String[] args)
	{
	 
	//Math is inbuilt class which is availble in java.util.lang package
	//By using Math dot We perform methods on it	
		
		//Math.addExact(int x,int y)
		//Math.addExact(long x,long y)
		
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.addExact(12, 22344667843l));  //we add l in long value it gives error
		
		
		//Math.subtractExact(int x,int y)
		//Math.subtractExact(long x,long y)
		System.out.println(Math.subtractExact(20,5));
		System.out.println(Math.subtractExact(1233, 12344467631l));
		
		//Math.multiplyExact(int x,int y);
		//Math.multiplyExact(long x ,long y)

		System.out.println(Math.multiplyExact(5, 5));
	    System.out.println(Math.multiplyExact(123, 6753556764l));
	    
	    //There is no parameter for random
	   // Math.random() returns a random double value greater than or equal to 0.0 and less than 1.0

	    System.out.println(Math.random());
	    
	    //It will give Pi value = 3.14 
        System.out.println(Math.PI);
        
        //Math.Max(double x ,double y)
        //Math..Max(Float x, float y)
        //Math.Max(int x ,int y)
        //Math.Max(lon x,long y)
        
      System.out.println(Math.max(12.43, 20.44));
      System.out.println(Math.max(1.2, 3.4));
      
      System.out.println(Math.max(12, 2));
      System.out.println(Math.max(2334444, 11111111111l));
      
      //It will print minimum value between two values
      //Math.min(int x,int y)
      //Math.min(double x, double y)
      //Math.min(float x,float y)
      //Math.min(long x, long y)

      System.out.println(Math.min(10, 3));
      System.out.println(Math.min(12.344, 23.4555));
      System.out.println(Math.min(1.2f, 3.4f));
      System.out.println(Math.min(12344555,6777788877l));
      
      System.out.println(Math.sqrt(2.4));
      
      System.out.println(Math.abs(32.33));
      System.out.println(Math.abs(123.3f));
      System.out.println(Math.abs(12));
      System.out.println(2345678899098l);
      
        
	}

}
