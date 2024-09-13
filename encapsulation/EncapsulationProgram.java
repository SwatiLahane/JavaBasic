package encapsulation;




class Facebook_Program
{

	private String username = "abc@gmail.com";
	private String password = "swatiabc@"; 
	 
	public String getUsername()
	 {
		   return username;
		
	 }
	public  void setUsername(String username)
	 {
		 this.username = username; 
		
	 }
	 public String getPassword()
	 {
		 return password; 
	 }
	 
	 public void setPassword(String password)
	 {
		  this.password = password;
	 }
}

public class EncapsulationProgram 
{
	
 
	public static void main(String[] args) 
	{
		Facebook_Program obj = new Facebook_Program();
		obj.setUsername("swati@gmail.com");
	    System.out.println(obj.getUsername());
	    obj.setPassword("lahane@12");
	    
	    System.out.println(obj.getPassword());
		          
 
	}

}
