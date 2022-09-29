package com.flight.project.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="scheduledflights")
public class ScheduledFlight {
	
	    @Id
	    @Column(name="scheduleflightid")
	    private BigInteger scheduleflightid;

	    @OneToOne(fetch = FetchType.EAGER)
	    private Flight flight;
	    
	    @Column(name="availableSeats")
	    private int availableSeats;
	    
	    @OneToOne(fetch = FetchType.EAGER)
	    private Schedule schedule;

		public ScheduledFlight(BigInteger scheduleflightid, Flight flight, int availableSeats, Schedule schedule) {
			super();
			this.scheduleflightid = scheduleflightid;
			this.flight = flight;
			this.availableSeats = availableSeats;
			this.schedule = schedule;
		}

		public ScheduledFlight() {
			super();
		}

		public BigInteger getScheduleflightid() {
			return scheduleflightid;
		}

		public void setScheduleflightid(BigInteger scheduleflightid) {
			this.scheduleflightid = scheduleflightid;
		}

		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		public int getAvailableSeats() {
			return availableSeats;
		}

		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}

		public Schedule getSchedule() {
			return schedule;
		}

		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}
	    

}
