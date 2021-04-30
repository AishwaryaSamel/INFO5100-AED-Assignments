/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flights;

import java.util.ArrayList;

/**
 *
 * @author Sriram
 */
public class FlightsDirectory {
    private ArrayList<Flights> flightsDirectory;

    public FlightsDirectory(){
        flightsDirectory = new ArrayList<Flights>();
    }

    public ArrayList<Flights> getFlightsDirectory() {
        return flightsDirectory;
    }

    public void setFlightsDirectory(ArrayList<Flights> airlinerDirectory) {
        this.flightsDirectory = flightsDirectory;
    }
    
    public Flights addFlight(){
        Flights newFlight = new Flights();
        flightsDirectory.add(newFlight);
        return newFlight;
    }
    
    public void removeFlight(Flights flights){
        flightsDirectory.remove(flights);
    }
}
