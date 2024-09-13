package encapsulation;

class Amazon
{
	
    private String username = "swatilahane@gmail.com";
    private String password = "Swat@123";

	
	public String getUsername()
	 {
	 	 return username;
	 }
	public void setUsername(String Username)
	 {   
		this.username = Username;
		
	 }
	public String getPassword()
	{
		return password;
		
	}
	public void setPassword(String Password)
	{  
		this.password = Password;
	}

}

public class EncapsulationPractice {
	
	
	public static void main(String[] args)
	{
		
		Amazon aobj = new Amazon();
		aobj.setUsername("Lahane@gamil.com");
		System.out.println(aobj.getUsername());
		
		aobj.setPassword("ABC@1233");
		System.out.println(aobj.getPassword());
         		
	
	}

}
