package productpkg;
 import java.util.*;

 public class Product{
 	private int  productID;
 	private String name;
 	private String category;
 	public double price;
 	public double discount;


 	public Product(){

 	}
 	public Product(int productID,String name,String category,double price,double discount){
 		this.productID=productID;
 		this.name=name;
 		this.category=category;
 		this.price=price;
 		this.discount=discount;
 	}

 	public void setProductID(int productID){
 		this.productID=productID;
 	}
 	public void setName(String name){
 		this.name=name;
 	 	}
 	
 	public void setCategory(String category){
 		this.category=category;
 	}
 	public void setPrice(double price){
 		this.price=price;
 	}

 	public void setDiscount(double discount){
 		this.discount=discount;
 	}

 	int getProductID(){
 		return productID;
 	}
 	String getName(){
 		return name;
 	}
 	
 	String getCategory(){
 		return category;
 	}
 	double getPrice(){
 		return price;
 	}
 	double getDiscount(){
 		return discount;
 	}


public void displayProduct(){
	System.out.println("-------------------------------");
	System.out.println("Product ID Number:    "+productID);
	System.out.println("Product Name :        "+name);
	System.out.println("Product Category:     "+category);
	System.out.println("Price:                "+price);
	System.out.println("discount:             "+discount);
	System.out.println("-------------------------------");
}

 }