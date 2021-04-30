/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Fleet.Fleet;
import Business.Fleet.FleetDirectory;
import Business.Flights.FlightsDirectory;

/**
 *
 * @author Sriram
 */
public class Airliner {
    private String Name;
    private String Address;
    private int totalFlights;
    private String originCountry;
    
    private FleetDirectory fleetDirectory;
    private FlightsDirectory flightsDirectory;

    public FlightsDirectory getFlightsDirectory() {
        return flightsDirectory;
    }

    public void setFlightsDirectory(FlightsDirectory flightsDirectory) {
        this.flightsDirectory = flightsDirectory;
    }
    
    public Airliner(){
        fleetDirectory  = new FleetDirectory();
        flightsDirectory = new FlightsDirectory();
    }

    public FleetDirectory getFleetDirectory() {
        return fleetDirectory;
    }

    public void setFleetDirectory(FleetDirectory fleetDirectory) {
        this.fleetDirectory = fleetDirectory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getTotalFlights() {
        return totalFlights;
    }

    public void setTotalFlights(int totalFlights) {
        this.totalFlights = totalFlights;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
    
    @Override
    public String toString() {
        return this.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
