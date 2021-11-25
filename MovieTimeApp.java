package Abstract.MovieTickets;

public class MovieTimeApp extends TicketBookingApp{
	
	public  MovieTimeApp()
	{
		System.out.println("Welcome to MovieTime!!!... Enjoy Your Movies ");
	}

	@Override
	public void availableSeats() {
		
		System.out.println("Select your Seats and Classes ");
	}

	@Override
	public void paymentMode() {
		System.out.println("Use online payment get more offers");
		
	}

}
