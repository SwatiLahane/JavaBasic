package day23_31Jul;

interface Circle
{
	 float PI = 3.14f;
	 public  float Area (float Radius);
	 public float Circumferance(float Radius);
	 
}

class PPA implements Circle 
{
	 public float Area(float Radius )
	 {
		 return PI * Radius*Radius;
	 }

	
	public float Circumferance(float Radius)
	{
		return 2 * PI *Radius;
		
	}
	 
	
}

public class InterfaceDemo {

	public static void main(String[] args) 
	{
           
        PPA pobj = new PPA();
        System.out.println("Value of PI is :"+pobj.PI);
        
        float fret = 0.0f;
        fret = pobj.Area(20.3f);
        System.out.println("Area of circle is :"+fret );
        
	    fret = pobj.Circumferance(10.23f);
	    System.out.println("Circumfarence is :"+fret);
	
	}
	
	

}
