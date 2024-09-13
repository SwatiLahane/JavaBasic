package mathclass;


public class MathClass 
{
   //Math class present in java.lang package n the classes available in java.lang 
	//we need not to create object of it System is available in java.lang
	//Math is static method
	public static void main(String arg[])
	{
		 Math.addExact(45, 55);
		 System.out.println(Math.addExact(45, 55));
		 Math.addExact(123445555666l, 86);//write l if we are printing long number then it consider long
		 
		 System.out.println(Math.subtractExact(40, 20));
		 System.out.println(Math.subtractExact(1234444l, 78));
		 System.out.println(Math.multiplyExact(3, 5));
		 System.out.println(Math.multiplyExact(12232345467l, 233));
		 System.out.println(Math.max(100, 209));
		 System.out.println(Math.max(2.4,6.9));
		 System.out.println(Math.max(233455666, 899));
		 
	}
	
}
