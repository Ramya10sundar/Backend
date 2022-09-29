package com.flight.project.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.dto.ScheduledFlight;

public interface ScheduledFlightRep  extends JpaRepository <ScheduledFlight, BigInteger>   {





}