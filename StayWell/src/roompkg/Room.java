package roompkg;
 import java.util.*;

 public class Room{
 	private int  roomNumber;
 	private String type;
 	public double rateperNight;
 	public double discount;


 	public Room(){

 	}
 	public Room(int roomNumber,String type,double rateperNight,double discount){
 		this.roomNumber=roomNumber;
 		this.type=type;
 		this.rateperNight=rateperNight;
 		this.discount=discount;
 	}

 	public void setRoomNumber(int roomNumber){
 		this.roomNumber=roomNumber;
 	}
 	public void setType(String type){
 		this.type=type;
 	 	}
 	
 	public void setRateperNight(double rateperNight){
 		this.rateperNight=rateperNight;
 	}
 	public void setDiscount(double discount){
 		this.discount=discount;
 	}

 	int getRoomNumber(){
 		return roomNumber;
 	}
 	String getType(){
 		return type;
 	}
 	
 	double getRateperNight(){
 		return rateperNight;
 	}
 	double getDiscount(){
 		return discount;
 	}


public void displayRoom(){
	System.out.println("-------------------------------");
	System.out.println("Room Number:   "+roomNumber);
	System.out.println("Room type :    "+type);
	System.out.println("Room rate:     "+rateperNight);
	System.out.println("discount:      "+discount);
	System.out.println("-------------------------------");
}

 }