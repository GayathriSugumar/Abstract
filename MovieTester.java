package Abstract.MovieTickets;

public class MovieTester {

	public static void main(String[] args) {
		BookMyShow m1=new BookMyShow();
		m1.login("gay3", "123");
		m1.ShowTiming();
		m1.availableSeats();
		m1.paymentMode();
		m1.logout();
		System.out.println();
		
		MovieTimeApp m2=new MovieTimeApp();
		m2.login("gayu","1234");
		m2.ShowTiming();
		m2.availableSeats();
		m2.paymentMode();
		m2.logout();
	}

}
