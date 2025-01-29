package rentalpkg;
import carpkg.*;

import java.util.*;
public class RentCar{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Available Car");

		System.out.println(String.format("Enter 1:- Car ID: 10126 | Car model: A6 plus | brand Name: Audi | Rent Price per day : 4800.0 | discount: 5.0"));
		System.out.println(String.format("Enter 2:- Car ID: 84567 | Car model: creta | brand Name: Hyundai | Rent Price per day : 2800.0 | discount: 5.0"));
		System.out.println(String.format("Enter 3:- Car ID: 75846 | Car model: X5 2023 | brand Name: BMW | Rent Price per day : 5200.0 | discount: 5.0"));

		
		
		Car p=new Car();

		System.out.println("Enter your Choice");
	    int num=sc.nextInt();

	    switch(num){
	    	case 1:
	    	{
	    		p.setCarID(10126);
	    		p.setModel("A6 plus");
	    		p.setBrand("Audi");
	    		p.setRentalPricePerDay(4800);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	case 2:
	    	{
	    		p.setCarID(84567);
	    		p.setModel("creta");
	    		p.setBrand("Hyundai");
	    		p.setRentalPricePerDay(2800);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	case 3:
	    	{
	    		p.setCarID(75846);
	    		p.setModel("X5 2023");
	    		p.setBrand("BMW");
	    		p.setRentalPricePerDay(5200);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	default:
	    	{
	    		System.out.println("You Enter Wrong Choice");
	    	}
	    }

	    p.displayMovie();


		Rental o=new Rental();
		Random rand = new Random();

		
	    o.setRentalID(rand.nextInt(10000));
	    System.out.println("Enter the Customer ID");
	    o.setCustomerID(sc.nextInt());
	    System.out.println("Enter the Customer Name");
	    sc.nextLine();
	    o.setCustomerName(sc.nextLine());
	    System.out.println("Enter the Number of Days");
	    o.setNumberofDays(sc.nextInt());

	    o.getTotal(o,p);
	    

	    o.displayRental();
		
	}
}

