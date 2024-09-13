package encapsulation;


class Demmo_Authentication
{
	private int  otp = 0000;
	
	
	public int getOtp()
	{
		return otp;
	}
	public int setOtp(int iotp)
	{    
		this.otp = iotp;
		return otp;
		
	}
}

public class Encapsulation_Integer {

	 
	public static void main(String[] args)
	{
	    
		Demmo_Authentication obj = new Demmo_Authentication();
		
		obj.setOtp(145);
		System.out.println(obj.getOtp());
		
	}

} 
