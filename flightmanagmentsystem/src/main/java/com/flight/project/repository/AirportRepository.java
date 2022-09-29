package com.flight.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.project.dto.Airport;
@Repository
public interface AirportRepository extends JpaRepository<Airport,Long>{


}
