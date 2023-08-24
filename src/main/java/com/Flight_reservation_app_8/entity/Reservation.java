package com.Flight_reservation_app_8.entity;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity

public class Reservation extends AbstractEntity {
private boolean chechedIn;
private int numberOfBags;

@OneToOne
private Passenger passenger;

@OneToOne
private flight flight;
public boolean isChechedIn() {
	return chechedIn;
}
public void setChechedIn(boolean chechedIn) {
	this.chechedIn = chechedIn;
}
public int getNumberOfBags() {
	return numberOfBags;
	
}
public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}
public Passenger getPassenger() {
	return passenger;
}
public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}
public flight getflight() {
	return flight;
}
public void setflight(flight flight) {
	this.flight = flight;
}
}
