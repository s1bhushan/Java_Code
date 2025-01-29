
package orderpkg;
import productpkg.*;

 import java.util.*;

 public class Order{
 	private int orderID;
 	private int customerID;
 	private String customerName;
 	private int quantity;
 	private double total;

 	public Order(){

 	}
 	public Order(int orderID,int customerID,String customerName,int quantity,double total){
 		this.orderID=orderID;
 		this.customerID=customerID;
 		this.customerName=customerName;
 		this.quantity=quantity;
 		this.total=total;

 	}

 	public void setOrderID(int orderID){
 		this.orderID=orderID;
 	}
 	public void setCustomerID(int customerID){
 		this.customerID=customerID;
 	 	}
 	public void setCustomerName(String customerName){
 		this.customerName=customerName;
 	}
 	public void setQuantity(int quantity){
 		this.quantity=quantity;
 	}
 	public void setTotal(double total){
 		this.total=total;
 	}

 	int getOrderID(){
 		return orderID;
 	}
 	int getCustomerID(){
 		return customerID;
 	}
 	String getCustomerName(){
 		return customerName;
 	}
 	int getQuantity(){
 		return quantity;
 	}

 	double getTotal(Order getOrder,Product getProduct){
 		total=getOrder.quantity*getProduct.price-((getProduct.discount*getProduct.price)/100);
 		return total;
 	}




 	void displayOrder(){
 	System.out.println("-------------------------------");
	System.out.println("Order Id:                "+orderID);
	System.out.println("Custemer ID :            "+customerID);
	System.out.println("Custemer Name:           "+customerName);
	System.out.println("Quantity:                "+quantity);
	System.out.println("                                    ");
	System.out.println("Total After Discount:    "+total);
	System.out.println("-------------------------------");
	System.out.println("-----------Thank you-----------");
}
 }