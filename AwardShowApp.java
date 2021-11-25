package Abstract.AwardsShowApp;

public abstract class AwardShowApp {

	public void login(String userName,String password)
	{
		System.out.println("Login Successfully");
	}
	public void logout()
	{
		System.out.println("Logout Successfully");
	}
	
	abstract public void selectIdols();
	abstract public void selectFavoiteGroup();
}
