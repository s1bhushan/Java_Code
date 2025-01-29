 //book ID, title, author, price, and discount 
package bookpkg;
 import java.util.*;

 public class Book{
 	private int bookId;
 	private String title;
 	private String author;
 	public double price;
 	private double discount;


 	public Book(){

 	}
 	public Book(int bookId,String title,String author,double price,double discount){
 		this.bookId=bookId;
 		this.title=title;
 		this.author=author;
 		this.price=price;
 		this.discount=discount;
 	}

 	void setBookId(int bookId){
 		this.bookId=bookId;
 	}
 	void setTitle(String title){
 		this.title=title;
 	 	}
 	void setAuthor(String author){
 		this.author=author;
 	}
 	void setPrice(double price){
 		this.price=price;
 	}
 	void setDiscount(double discount){
 		this.discount=discount;
 	}

 	int getBookId(){
 		return bookId;
 	}
 	String getTitle(){
 		return title;
 	}
 	String getAuthor(){
 		return author;
 	}
 	double getPrice(){
 		return price;
 	}
 	double getDiscount(){
 		return discount;
 	}


public void displayBook(){
	System.out.println("-------------------------------");
	System.out.println("Book Id:   "+bookId);
	System.out.println("Title :    "+title);
	System.out.println("Author:    "+author);
	System.out.println("Book price:"+price);
	System.out.println("discount:  "+discount);
	System.out.println("-------------------------------");
}

 }