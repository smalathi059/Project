package com.demo.arrays;

public class BookTitles {

	private String title;
	private double price;
	private int year;
	public BookTitles(String title, double price, int year) {
		super();
		this.title = title;
		this.price = price;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
