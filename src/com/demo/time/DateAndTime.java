package com.demo.time;

import java.time.LocalDate;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		Date todaydate=new Date();
		System.out.println("Today date=>"+todaydate);
	}

}