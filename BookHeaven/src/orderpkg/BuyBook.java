//which creates instances of Book and Order, calculates the total payable amount, and displays book and order details.
package orderpkg;
import bookpkg.*;

import java.util.*;
public class BuyBook{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Book b=new Book(55,"Mahabarat","Valmici",2500,20);
		

		System.out.println("Available BOOK");
		b.displayBook();

		Order o=new Order();

		System.out.println("Enter the order ID");
	    o.setOrderId(sc.nextInt());
	    System.out.println("Enter the Cust ID");
	    o.setCustId(sc.nextInt());
	    System.out.println("Enter the CustName");
	    sc.nextLine();
	    o.setCustName(sc.nextLine());
	    System.out.println("Enter the Quantity");
	    o.setQuantity(sc.nextInt());

	    o.getTotal(b,o);
	    




	    o.displayOrder();
		
	}
}
