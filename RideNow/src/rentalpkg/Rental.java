
package rentalpkg;
import carpkg.*;

 import java.util.*;

 public class Rental{
 	private int rentalID;
 	private int customerID;
 	private String customerName;
 	private int numberofDays;
 	private double total;

 	public Rental(){

 	}
 	public Rental(int rentalID,int customerID,String customerName,int numberofDays,double total){
 		this.rentalID=rentalID;
 		this.customerID=customerID;
 		this.customerName=customerName;
 		this.numberofDays=numberofDays;
 		this.total=total;

 	}

 	public void setRentalID(int rentalID){
 		this.rentalID=rentalID;
 	}
 	public void setCustomerID(int customerID){
 		this.customerID=customerID;
 	 	}
 	public void setCustomerName(String customerName){
 		this.customerName=customerName;
 	}
 	public void setNumberofDays(int numberofDays){
 		this.numberofDays=numberofDays;
 	}
 	public void setTotal(double total){
 		this.total=total;
 	}

 	int getRentalID(){
 		return rentalID;
 	}
 	int getCustomerID(){
 		return customerID;
 	}
 	String getCustomerName(){
 		return customerName;
 	}
 	int getNumberofDays(){
 		return numberofDays;
 	}

 	double getTotal(Rental getRent,Car getCar){
 		if(getRent.numberofDays>2){
 			total=getRent.numberofDays*getCar.rentalPricePerDay-((getCar.discount*getCar.rentalPricePerDay)/100);
 		}
 		else{
 			total=getRent.numberofDays*getCar.rentalPricePerDay;
 		}
 		return total;
 	}




 	void displayRental(){
 		System.out.println(" ");
 		System.out.println(" ");
 	System.out.println("--------------RideNow------------------------");
	

 	System.out.println("---------------------------------------------");
	System.out.println("Rental Id:           "+rentalID);
	System.out.println("Custemer ID :        "+customerID);
	System.out.println("Custemer Name:       "+customerName);
	System.out.println("Number Of Day:       "+numberofDays);
	System.out.println("         ");
	System.out.println("Total After Discount: "+total);
	System.out.println("---------------------------------------------");
	System.out.println("--------------Thank you----------------------");
	System.out.println(" ");
	System.out.println(" ");
}
 }