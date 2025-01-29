
package reservationpkg ;
import roompkg.*;

 import java.util.*;
 

 public class Reservation{
 	private int reservationID;
 	private int customerID;
 	private String customerName;
 	private int numberofNights;
 	private double total;



 	public Reservation(){

 	}
 	public Reservation(int reservationID,int customerID,String customerName,int numberofNights,double total){
 		this.reservationID=reservationID;
 		this.customerID=customerID;
 		this.customerName=customerName;
 		this.numberofNights=numberofNights;
 		this.total=total;

 	}

 	public void setReservationID(int reservationID){
 		this.reservationID=reservationID;
 	}
 	public void setCustomerID(int customerID){
 		this.customerID=customerID;
 	 	}
 	public void setCustomerName(String customerName){
 		this.customerName=customerName;
 	}
 	public void setNumberofNights(int numberofNights){
 		this.numberofNights=numberofNights;
 	}
 	public void setTotal(double total){
 		this.total=total;
 	}

 	int getReservationID(){
 		return reservationID;
 	}
 	int getCustomerID(){
 		return customerID;
 	}
 	String getCustomerName(){
 		return customerName;
 	}
 	int getNumberofNights(){
 		return numberofNights;
 	}


 	double getTotal(Reservation getReservation,Room getRoom){
 		total=getReservation.numberofNights*getRoom.rateperNight-((getRoom.discount*getRoom.rateperNight)/100);
 		return total;
 	}




 	void displayReservation(){
 	System.out.println("-------------------------------");
	System.out.println("Reservation Id:          "+reservationID);
	System.out.println("Custemer ID :            "+customerID);
	System.out.println("Custemer Name:           "+customerName);
	System.out.println("Number of Night:         "+numberofNights);
	System.out.println("Total After Discount:    "+total);
	System.out.println("-------------------------------");
}
 }