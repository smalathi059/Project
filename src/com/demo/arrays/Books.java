package com.demo.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Books {

	public static void main(String[] args) {
		 List<BookTitles> books = new ArrayList<>();
	       books.add(new BookTitles("The Great Indian Novel", 25.0, 2005));
	       books.add(new BookTitles("Twisted Love", 35.0, 2010));
	       books.add(new BookTitles("Daniyal Silva", 40.0, 1999));
	       books.add(new BookTitles("In Five years", 50.0, 2020));
	       books.add(new BookTitles("The Help", 60.0, 1996));
	       books.add(new BookTitles("OffSpring", 75.0, 1994));
	       	
	       System.out.println("Titles of books published after 2000:");
	      books.stream().filter(p->p.getYear()>2000)
	    		   .map(BookTitles::getTitle).forEach(System.out::println);
	      
	      System.out.println("Calculate the total price of all books: ");
	      double totalPrice = books.stream().mapToDouble(BookTitles::getPrice).sum();
	      System.out.println(totalPrice);
	      
	      System.out.println("Find the book with the highest price: ");
	      Optional<BookTitles> highestPricebook =books.stream().max(Comparator.comparing(BookTitles::getPrice));
	      highestPricebook.ifPresent(book -> System.out.println("Book with highest price: " + book.getTitle() + ", Price: $" + book.getPrice()));
	      
	      System.out.println("Create a new list with books priced less than $40: ");
	      books.stream().filter(book -> book.getPrice() < 40).map(book -> book.getTitle() + ", Price: $" + book.getPrice() + ", Year:"+book.getYear()).forEach(System.out::println);
	     
	     

	      
	}

}
