package com.flight.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengers")
public class Passenger {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private long pid;
	    @Column(name="pnr_num")
	    private long pnrNumber;
	    @Column(name="p_name")
	    private String passengerName;
	    @Column(name="p_age")
	    private int passengerAge;
	    @Column(name="p_UIN")
	    private long passengerUIN;
	    @Column(name="luggage")
	    private double Luggage;
		public Passenger(long pid, long pnrNumber, String passengerName, int passengerAge, long passengerUIN,
				double luggage) {
			super();
			this.pid = pid;
			this.pnrNumber = pnrNumber;
			this.passengerName = passengerName;
			this.passengerAge = passengerAge;
			this.passengerUIN = passengerUIN;
			Luggage = luggage;
		}
		public Passenger() {
			super();
		}
		public long getPid() {
			return pid;
		}
		public void setPid(long pid) {
			this.pid = pid;
		}
		public long getPnrNumber() {
			return pnrNumber;
		}
		public void setPnrNumber(long pnrNumber) {
			this.pnrNumber = pnrNumber;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public int getPassengerAge() {
			return passengerAge;
		}
		public void setPassengerAge(int passengerAge) {
			this.passengerAge = passengerAge;
		}
		public long getPassengerUIN() {
			return passengerUIN;
		}
		public void setPassengerUIN(long passengerUIN) {
			this.passengerUIN = passengerUIN;
		}
		public double getLuggage() {
			return Luggage;
		}
		public void setLuggage(double luggage) {
			Luggage = luggage;
		}
	    

}
