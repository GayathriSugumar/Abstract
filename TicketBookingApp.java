package Abstract.MovieTickets;

public abstract class TicketBookingApp {
	
	public void login(String userName,String password)
	{
		System.out.println("Login Successfully");
	}
	public void logout()
	{
		System.out.println("Logout Successfully");
	}
	public void ShowTiming()
	{
		System.out.println("Check Available Shows");
	}
	
	abstract public void availableSeats();
	abstract public void paymentMode();

}
