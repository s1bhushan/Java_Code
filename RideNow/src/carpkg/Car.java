package carpkg;
 import java.util.*;

 public class Car{
 	private int  carID;
 	private String model;
 	private String brand;
 	public double rentalPricePerDay;
 	public double discount;


 	public Car(){

 	}
 	public Car(int carID,String model,String brand,double rentalPricePerDay,double discount){
 		this.carID=carID;
 		this.model=model;
 		this.brand=brand;
 		this.rentalPricePerDay=rentalPricePerDay;
 		this.discount=discount;
 	}

 	public void setCarID(int carID){
 		this.carID=carID;
 	}
 	public void setModel(String model){
 		this.model=model;
 	 	}
 	
 	public void setBrand(String brand){
 		this.brand=brand;
 	}
 	public void setRentalPricePerDay(double rentalPricePerDay){
 		this.rentalPricePerDay=rentalPricePerDay;
 	}

 	public void setDiscount(double discount){
 		this.discount=discount;
 	}

 	int getCarID(){
 		return carID;
 	}
 	String getModel(){
 		return model;
 	}
 	
 	String getBrand(){
 		return brand;
 	}
 	double getRentalPricePerDay(){
 		return rentalPricePerDay;
 	}
 	double getDiscount(){
 		return discount;
 	}


public void displayMovie(){
	System.out.println("-------------------------------");
	System.out.println("Car ID:               "+carID);
	System.out.println("Car model:            "+model);
	System.out.println("brand Name:           "+brand);
	System.out.println("Rent Price per day :  "+rentalPricePerDay);
	System.out.println("discount:             "+discount);
	System.out.println("-------------------------------");
}

 }