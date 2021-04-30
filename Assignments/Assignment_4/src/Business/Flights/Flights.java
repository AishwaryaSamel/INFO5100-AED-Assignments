/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flights;

import Business.Seat.SeatDirectory;

/**
 *
 * @author Sriram
 */
public class Flights {
    private String flightNumber;
    private String departureLocation;
    private String arrivalLocation;
    private String preferedTimeOfDay;
    private int price;
    private String airplane;
    
    private SeatDirectory seatDirectory;
    
    public Flights(){
        seatDirectory = new SeatDirectory();
    }
    
    public SeatDirectory getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(SeatDirectory seatDirectory) {
        this.seatDirectory = seatDirectory;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getPreferedTimeOfDay() {
        return preferedTimeOfDay;
    }

    public void setPreferedTimeOfDay(String preferedTimeOfDay) {
        this.preferedTimeOfDay = preferedTimeOfDay;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    private String Date;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return this.getFlightNumber(); //To change body of generated methods, choose Tools | Templates.
    }
}
