package com.flight.project.servicelayer;

import java.math.BigInteger;
import java.util.List;

import com.flight.project.dto.ScheduledFlight;

public interface ScheduledFlightService {
	
	ScheduledFlight saveScheduledFlight(ScheduledFlight scheduledflight);

    List<ScheduledFlight> getAllScheduledFlight();
   
    ScheduledFlight getScheduledFlightById(BigInteger id);
    
    ScheduledFlight updateScheduledFlight(ScheduledFlight scheduledflight, BigInteger id);

    void deleteScheduledFlight(BigInteger id);
	

}
