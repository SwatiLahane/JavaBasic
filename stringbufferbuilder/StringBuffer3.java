package stringbufferbuilder;

public class StringBuffer3 {

	public static void main(String[] args) {
		
         StringBuffer sobj = new StringBuffer("Hello");
                                              //01234567891011     
         StringBuffer sobj1 = new StringBuffer("Swati Lahane");
         
        // sobj.delete(0, 2); //it will work 0 to 1 (2-1)
         //System.out.println(sobj); 
         
         
         //sobj1.delete(6, 9);//9-1 it will delete string (6 to 8)
         //System.out.println(sobj1);
         
         
         sobj1.delete(0 , 5); //it will delete 0 to 4 (5-1)
         System.out.println(sobj1);// o/p(space lahane )
         
	}
 
}
