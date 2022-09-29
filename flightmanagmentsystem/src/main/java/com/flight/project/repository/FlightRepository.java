package com.flight.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.dto.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}