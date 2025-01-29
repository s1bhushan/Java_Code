package moviepkg;
 import java.util.*;

 public class Movie{
 	private int  movieID;
 	private String title;
 	private String genre;
 	public double ticketPrice;
 	public double discount;


 	public Movie(){

 	}
 	public Movie(int movieID,String title,String genre,double ticketPrice,double discount){
 		this.movieID=movieID;
 		this.title=title;
 		this.genre=genre;
 		this.ticketPrice=ticketPrice;
 		this.discount=discount;
 	}

 	public void setMovieID(int movieID){
 		this.movieID=movieID;
 	}
 	public void setTitle(String title){
 		this.title=title;
 	 	}
 	
 	public void setGenre(String genre){
 		this.genre=genre;
 	}
 	public void setTicketPrice(double ticketPrice){
 		this.ticketPrice=ticketPrice;
 	}

 	public void setDiscount(double discount){
 		this.discount=discount;
 	}

 	int getMovieID(){
 		return movieID;
 	}
 	String getTitle(){
 		return title;
 	}
 	
 	String getGenre(){
 		return genre;
 	}
 	double getTicketPrice(){
 		return ticketPrice;
 	}
 	double getDiscount(){
 		return discount;
 	}


public void displayMovie(){
	System.out.println("-------------------------------");
	System.out.println("Movie ID:             "+movieID);
	System.out.println("Movie Title :         "+title);
	System.out.println("Movie Type:           "+genre);
	System.out.println("Price:                "+ticketPrice);
	System.out.println("discount:             "+discount);
	System.out.println("-------------------------------");
}

 }