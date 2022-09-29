package com.flight.project.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.project.dto.ScheduledFlight;
import com.flight.project.servicelayer.ScheduledFlightService;

@RestController
@RequestMapping("/api/scheduledflights")
public class ScheduledFlightController {
	
    private ScheduledFlightService scheduledflightService;
    
   
    public ScheduledFlightController(ScheduledFlightService scheduledflightService) {
        super();
        this.scheduledflightService = scheduledflightService;
    }
   
    
    @PostMapping()
    public ResponseEntity<ScheduledFlight> saveScheduledFlight(@RequestBody ScheduledFlight scheduledflight) {
        return new ResponseEntity<ScheduledFlight>
        (scheduledflightService.saveScheduledFlight(scheduledflight), HttpStatus.CREATED);
    }
    
    
    @GetMapping
    public List<ScheduledFlight> getAllScheduledFlight()
    {
        return scheduledflightService.getAllScheduledFlight();
    }
    
   
    @GetMapping("{id}")
    public ResponseEntity<ScheduledFlight> getScheduledFlightById(@PathVariable("id") BigInteger scheduledflightId)
    {
//        return new ResponseEntity<ScheduledFlight>(scheduledflightService.getScheduledFlightById(scheduledflightId),HttpStatus.OK);
    	return new ResponseEntity<ScheduledFlight>(scheduledflightService.getScheduledFlightById(scheduledflightId),HttpStatus.OK);
    }
    
   
    @PutMapping("{id}")
    public ResponseEntity<ScheduledFlight> updateScheduledFlight(@PathVariable("id") BigInteger id,
            @RequestBody ScheduledFlight scheduledflight)
    {
        return new ResponseEntity<ScheduledFlight>(scheduledflightService.updateScheduledFlight(scheduledflight, id), HttpStatus.OK);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<ScheduledFlight> deleteScheduledFlight(@PathVariable("id")BigInteger id)
    {
        //delete
        scheduledflightService.deleteScheduledFlight(id);
        return new ResponseEntity<ScheduledFlight>(HttpStatus.OK);
    }
    
}
