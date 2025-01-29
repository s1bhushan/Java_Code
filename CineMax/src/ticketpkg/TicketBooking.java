
package ticketpkg;
import moviepkg.*;

 import java.util.*;

 public class TicketBooking{
 	private int bookingID;
 	private int customerID;
 	private String customerName;
 	private int numberofTickets;
 	private double total;

 	public TicketBooking(){

 	}
 	public TicketBooking(int bookingID,int customerID,String customerName,int numberofTickets,double total){
 		this.bookingID=bookingID;
 		this.customerID=customerID;
 		this.customerName=customerName;
 		this.numberofTickets=numberofTickets;
 		this.total=total;

 	}

 	public void setBookingID(int bookingID){
 		this.bookingID=bookingID;
 	}
 	public void setCustomerID(int customerID){
 		this.customerID=customerID;
 	 	}
 	public void setCustomerName(String customerName){
 		this.customerName=customerName;
 	}
 	public void setNumberofTickets(int numberofTickets){
 		this.numberofTickets=numberofTickets;
 	}
 	public void setTotal(double total){
 		this.total=total;
 	}

 	int getBookingID(){
 		return bookingID;
 	}
 	int getCustomerID(){
 		return customerID;
 	}
 	String getCustomerName(){
 		return customerName;
 	}
 	int getNumberofTickets(){
 		return numberofTickets;
 	}

 	double getTotal(TicketBooking getTicket,Movie getMovie){
 		if(getTicket.numberofTickets>2){
 			total=getTicket.numberofTickets*getMovie.ticketPrice-((getMovie.discount*getMovie.ticketPrice)/100);
 		}
 		else{
 			total=getTicket.numberofTickets*getMovie.ticketPrice;
 		}
 		return total;
 	}




 	void displayTicketBooking(){
 	System.out.println("-------------------------------");
	System.out.println("Booking Id:                "+bookingID);
	System.out.println("Custemer ID :              "+customerID);
	System.out.println("Custemer Name:             "+customerName);
	System.out.println("Number Of Tickets:         "+numberofTickets);
	System.out.println("                                    ");
	System.out.println("Total After Discount:      "+total);
	System.out.println("-------------------------------");
	System.out.println("-----------Thank you-----------");
}
 }