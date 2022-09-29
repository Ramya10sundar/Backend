package com.flight.project.servicelayer;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dto.ScheduledFlight;
import com.flight.project.exception.DataNotFound;
import com.flight.project.repository.ScheduledFlightRep;
@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService{
	@Autowired
    private ScheduledFlightRep scheduled;
	

  public ScheduledFlightServiceImpl(ScheduledFlightRep scheduled) {
		super();
		this.scheduled = scheduled;
	}

@Override
    public ScheduledFlight saveScheduledFlight(ScheduledFlight scheduledflight) {
        return scheduled.save(scheduledflight);
    }
    
    @Override
    public List<ScheduledFlight> getAllScheduledFlight() {
        return scheduled.findAll();
    }
    
    @Override
    public ScheduledFlight getScheduledFlightById(BigInteger id)
    {
        return scheduled.findById(id).orElseThrow( () ->
        new DataNotFound("scheduledflight", "Id", id));
    }
    
    @Override
    public ScheduledFlight updateScheduledFlight(ScheduledFlight scheduledflight, BigInteger id)
    {
        ScheduledFlight existingScheduledFlight = scheduled.findById(id).orElseThrow(() ->
        new DataNotFound("scheduledflight", "Id", id));
        
        existingScheduledFlight.setFlight(scheduledflight.getFlight());
        existingScheduledFlight.setAvailableSeats(scheduledflight.getAvailableSeats());
        existingScheduledFlight.setSchedule(scheduledflight.getSchedule());
        //save
        scheduled.save(existingScheduledFlight);
        return existingScheduledFlight;
        
    }
    
    @Override
    public void deleteScheduledFlight(BigInteger id)
    {
        scheduled.findById(id).orElseThrow( () ->
        new DataNotFound("scheduledflight", "Id", id));
        scheduled.deleteById(id);
    }

}