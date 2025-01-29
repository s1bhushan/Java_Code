package reservationpkg ;
import roompkg.*;

import java.util.*;
public class BookRoom{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);


		System.out.println("Available Room");

		System.out.println(String.format("Room Number:1 | Room type : Single | Room rate:     2500.0 |discount:      20.0"));
		System.out.println(String.format("Room Number:2 | Room type : Double | Room rate:     4500.0 |discount:      20.0"));
		System.out.println(String.format("Room Number:3 | Room type : Single | Room rate:     1300.0 |discount:      20.0"));

		
		
		Room r=new Room();

		System.out.println("Enter your Choice");

		System.out.println("Enter the Room Number");
	    int num=sc.nextInt();

	    switch(num){
	    	case 1:
	    	{
	    		r.setRoomNumber(1);
	    		r.setType("Single");
	    		r.setRateperNight(2500);
	    		r.setDiscount(20);
	    		//Room r=new Room(1,"Single",2500,20);
	    		
	    		break;
	    	}
	    	case 2:
	    	{
	    		r.setRoomNumber(2);
	    		r.setType("Double");
	    		r.setRateperNight(4500);
	    		r.setDiscount(20);
	    		//Room r=new Room(2,"Double",4500,20);
	    		
	    		break;
	    	}
	    	case 3:
	    	{
	    		r.setRoomNumber(3);
	    		r.setType("Single");
	    		r.setRateperNight(1300);
	    		r.setDiscount(20);

	    		//Room r=new Room(3,"Single",1500,20);
	    		
	    		break;
	    	}
	    	default:
	    	{
	    		System.out.println("You Enter Wrong Choice");
	    	}
	    }

	    r.displayRoom();


		Reservation o=new Reservation();

		System.out.println("Enter the Reservation ID");
	    o.setReservationID(sc.nextInt());
	    System.out.println("Enter the Customer ID");
	    o.setCustomerID(sc.nextInt());
	    System.out.println("Enter the Customer Name");
	    sc.nextLine();
	    o.setCustomerName(sc.nextLine());
	    System.out.println("Enter the Number of Nights");
	    o.setNumberofNights(sc.nextInt());

	    o.getTotal(o,r);
	    




	    o.displayReservation();
		
	}
}

