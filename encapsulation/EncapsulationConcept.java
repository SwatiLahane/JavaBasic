package encapsulation;

class AmazonProgram
{
	  
	    private String username = "contact@grotechminds";
	    private String password = "Swati@123";
	    
	    public String getUsername()
	    {
	    	return username;
	    }
	    public void setUsername(String username)
	    {
	    	this.username = username;
	    	
	    }
	    public String getPassword(String password)
	    {
	    	return password;
	    }
	    
	    public void setPassword(String password)
	    {
	    	this.password = password; 
	    }
	     
	    
}



public class EncapsulationConcept {

	public static void main(String[] args)
	{
		
		AmazonProgram aobj = new AmazonProgram();
		
		aobj.setUsername("lahane@gmail.com");
		
		System.out.println(aobj.getUsername());
		
		new AmazonProgram().getUsername();
		
	}

}
