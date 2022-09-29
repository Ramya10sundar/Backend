package com.flight.project.servicelayer;

import java.math.BigInteger;
import java.util.List;

import com.flight.project.dto.Booking;

public interface BookingService {
Booking saveBooking(Booking book);
	
	//find the single booking
	Booking viewBooking(BigInteger id);
	
	//Find all booking
	List<Booking>viewAllBooking();
	
	//update Booking
	Booking updateBooking(Booking booking,BigInteger id);
	
	//Delete Booking
	void deleteBooking(BigInteger id);
}

