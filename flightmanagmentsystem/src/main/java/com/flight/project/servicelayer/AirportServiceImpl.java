package com.flight.project.servicelayer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.project.dto.Airport;
import com.flight.project.exception.DataNotFound;
import com.flight.project.repository.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService{
	
	private AirportRepository air;

	public AirportServiceImpl(AirportRepository air) {
		super();
		this.air = air;
	}
	@Override
	public Airport saveAirport(Airport airport) {
        return air.save(airport);
    }
	@Override
    public List<Airport> getAllAirports() {
        return air.findAll();
	}
	@Override
	public Airport getAirportById(long Id) {
		// TODO Auto-generated method stub
		return air.findById(Id).orElseThrow(()->
		new DataNotFound("Airport","Id",Id));
      		
	}

	

//        return air.findById(airportId).orElseThrow(()->
//        new AirportException("Airport","Code",airportId));
        		

}


