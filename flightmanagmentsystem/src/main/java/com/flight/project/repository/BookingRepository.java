package com.flight.project.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.project.dto.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,BigInteger> {

}