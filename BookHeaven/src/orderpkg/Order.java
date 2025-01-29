//orderID, custID, custName, quantity, and the total payable amount.

package orderpkg;
import bookpkg.*;

 import java.util.*;

 public class Order{
 	private int orderId;
 	private int custId;
 	private String custName;
 	private int quantity;
 	private double total;

 	public Order(){

 	}
 	public Order(int orderId,int custId,String custName,int quantity,double total){
 		this.orderId=orderId;
 		this.custId=custId;
 		this.custName=custName;
 		this.quantity=quantity;
 		this.total=total;

 	}

 	public void setOrderId(int orderId){
 		this.orderId=orderId;
 	}
 	public void setCustId(int custId){
 		this.custId=custId;
 	 	}
 	public void setCustName(String custName){
 		this.custName=custName;
 	}
 	public void setQuantity(int quantity){
 		this.quantity=quantity;
 	}
 	public void setTotal(double total){
 		this.total=total;
 	}

 	int getOrderId(){
 		return orderId;
 	}
 	int getCustId(){
 		return custId;
 	}
 	String getCustName(){
 		return custName;
 	}
 	int getQuantity(){
 		return quantity;
 	}
 	double getTotal(Book getBook,Order getOrder){
 		total=getOrder.quantity*getBook.price;
 		return total;
 	}




 	void displayOrder(){
 	System.out.println("-------------------------------");
	System.out.println("Order Id:         "+orderId);
	System.out.println("Custemer Id :     "+custId);
	System.out.println("Custemer Name:    "+custName);
	System.out.println("Quantity:         "+quantity);
	System.out.println("Total :           "+total);
	System.out.println("-------------------------------");
}
 }