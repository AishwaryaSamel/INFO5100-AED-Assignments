/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fleet;

import Business.Flights.FlightsDirectory;

/**
 *
 * @author Sriram
 */
public class Fleet {
    private String fleetPlane;
    
    private FlightsDirectory flightDirectory;
    
    public Fleet()
    {
        flightDirectory = new FlightsDirectory();
    }

    public FlightsDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightsDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    public String getFleetPlane() {
        return fleetPlane;
    }

    public void setFleetPlane(String fleetPlane) {
        this.fleetPlane = fleetPlane;
    }
    
    @Override
    public String toString() {
        return this.getFleetPlane(); //To change body of generated methods, choose Tools | Templates.
    }
}
