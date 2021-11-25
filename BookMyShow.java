package Abstract.MovieTickets;

public class BookMyShow extends TicketBookingApp {
	public BookMyShow() {
		System.out.println("Thanks for using BookMyShowApp ");
	}

	@Override
	public void availableSeats() {
		System.out.println("Check available Seats ");
		
	}

	@Override
	public void paymentMode() {
		System.out.println("Choose your payement mode and apply coupons ");
		
	}

}
