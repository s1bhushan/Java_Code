package ticketpkg;
import moviepkg.*;

import java.util.*;
public class BookTicket{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Available Movie");

		System.out.println(String.format("Enter 1 :- Movie ID:10126 | Movie Title : Singam Again          | Movie Type: Action        |Price: 250.0 Discount: 5.0"));
		System.out.println(String.format("Enter 2 :- Movie ID:45784 | Movie Title : Bhool Bhulaiyaa 3     | Movie Type: Horror Comedy |Price: 300.0 Discount: 5.0"));
		System.out.println(String.format("Enter 3 :- Movie ID:65245 | Movie Title : Venom: The Last Dance | Movie Type: Sci-Fi Action |Price: 450.0 Discount: 5.0"));

		
		
		Movie p=new Movie();

		System.out.println("Enter your Choice");
	    int num=sc.nextInt();

	    switch(num){
	    	case 1:
	    	{
	    		p.setMovieID(10126);
	    		p.setTitle("Singam Again");
	    		p.setGenre("Action");
	    		p.setTicketPrice(250);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	case 2:
	    	{
	    		p.setMovieID(45784);
	    		p.setTitle("Bhool Bhulaiyaa 3");
	    		p.setGenre("Horror Comedy");
	    		p.setTicketPrice(300);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	case 3:
	    	{
	    		p.setMovieID(65245);
	    		p.setTitle("Venom: The Last Dance");
	    		p.setGenre("Sci-Fi Action");
	    		p.setTicketPrice(450);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	default:
	    	{
	    		System.out.println("You Enter Wrong Choice");
	    	}
	    }

	    p.displayMovie();


		TicketBooking o=new TicketBooking();
		Random rand = new Random();

		
	    o.setBookingID(rand.nextInt(10000));
	    System.out.println("Enter the Customer ID");
	    o.setCustomerID(sc.nextInt());
	    System.out.println("Enter the Customer Name");
	    sc.nextLine();
	    o.setCustomerName(sc.nextLine());
	    System.out.println("Enter the Number of Ticket");
	    o.setNumberofTickets(sc.nextInt());

	    o.getTotal(o,p);
	    

	    o.displayTicketBooking();
		
	}
}

