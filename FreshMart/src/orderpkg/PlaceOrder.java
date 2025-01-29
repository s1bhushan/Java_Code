package orderpkg;
import productpkg.*;

import java.util.*;
public class PlaceOrder{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Available Product");

		System.out.println(String.format("Enter 1 :- Product ID Number: 10126 | Product Name : Milk | Product Category: Dairy | Price: 90.0 |discount: 5.0"));
		System.out.println(String.format("Enter 2 :- Product ID Number: 65846 | Product Name : Apple | Product Category: Fruit | Price: 280.0 |discount: 8.0"));
		System.out.println(String.format("Enter 3 :- Product ID Number: 45862 | Product Name : Rice | Product Category: Food | Price: 160.0 |discount: 12.0"));

		
		
		Product p=new Product();

		System.out.println("Enter your Choice");

		System.out.println("Enter the Room Number");
	    int num=sc.nextInt();

	    switch(num){
	    	case 1:
	    	{
	    		p.setProductID(10126);
	    		p.setName("Milk");
	    		p.setCategory("Dairy");
	    		p.setPrice(90);
	    		p.setDiscount(5);
	    		
	    		break;
	    	}
	    	case 2:
	    	{
	    		p.setProductID(65846);
	    		p.setName("Apple");
	    		p.setCategory("Fruit");
	    		p.setPrice(280);
	    		p.setDiscount(8);
	    		
	    		
	    		
	    		break;
	    	}
	    	case 3:
	    	{
	    		p.setProductID(45862);
	    		p.setName("Rice");
	    		p.setCategory("Food");
	    		p.setPrice(160);
	    		p.setDiscount(12);
	    		
	    		
	    		
	    		break;
	    	}
	    	default:
	    	{
	    		System.out.println("You Enter Wrong Choice");
	    	}
	    }

	    p.displayProduct();


		Order o=new Order();

		System.out.println("Enter the Order ID");
	    o.setOrderID(sc.nextInt());
	    System.out.println("Enter the Customer ID");
	    o.setCustomerID(sc.nextInt());
	    System.out.println("Enter the Customer Name");
	    sc.nextLine();
	    o.setCustomerName(sc.nextLine());
	    System.out.println("Enter the quantity");
	    o.setQuantity(sc.nextInt());

	    o.getTotal(o,p);
	    




	    o.displayOrder();
		
	}
}

