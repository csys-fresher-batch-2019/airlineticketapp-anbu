package com.chainsys.model;

import java.time.LocalDate;
import java.util.Date;

public class AirlineInfo {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineId == null) ? 0 : airlineId.hashCode());
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((fromTo == null) ? 0 : fromTo.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + noOfSeatsAvailable;
		result = prime * result + price;
		result = prime * result + totalSeats;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineInfo other = (AirlineInfo) obj;
		if (airlineId == null) {
			if (other.airlineId != null)
				return false;
		} else if (!airlineId.equals(other.airlineId))
			return false;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		if (fromTo == null) {
			if (other.fromTo != null)
				return false;
		} else if (!fromTo.equals(other.fromTo))
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (noOfSeatsAvailable != other.noOfSeatsAvailable)
			return false;
		if (price != other.price)
			return false;
		if (totalSeats != other.totalSeats)
			return false;
		return true;
	}
	
	public String getAirlineid() {
		return airlineId;
	}
	public void setAirlineId(String airlineid) {
		this.airlineId = airlineid;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlinename) {
		this.airlineName = airlinename;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalseats) {
		this.totalSeats = totalseats;
	}
	public int getNoOfSeatsAvailable() {
		return noOfSeatsAvailable;
	}
	public void setNoofseatsavailable(int noofseatsavailable) {
		this.noOfSeatsAvailable = noofseatsavailable;
	}
	public String getFromTo() {
		return fromTo;
	}
	public void setFromTo(String fromto) {
		this.fromTo = fromto;
	}
	public LocalDate getJourneydate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate date) {
		this.journeyDate = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String airlineName;
	private int totalSeats;
	private int noOfSeatsAvailable;
	private String fromTo;
	private LocalDate journeyDate;
	private int price;
	private String airlineId;
	
	
	
}
