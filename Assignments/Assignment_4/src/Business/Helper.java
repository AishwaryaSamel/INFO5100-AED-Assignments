/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airliner.AirlinerDirectory;
import Business.Customer.CustomerDirectory;
import Business.Fleet.FleetDirectory;
import Business.Flights.FlightsDirectory;
import Business.Seat.SeatDirectory;

/**
 *
 * @author Sriram
 */
public class Helper {

    private AirlinerDirectory airlinerDirectory;
    private FlightsDirectory flightsDirectory;
    private CustomerDirectory customerDirectory;

    
        public Helper() {
            airlinerDirectory = new AirlinerDirectory();
            flightsDirectory = new FlightsDirectory();
            customerDirectory = new CustomerDirectory();
    }

    

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public FlightsDirectory getFlightsDirectory() {
        return flightsDirectory;
    }

    public void setFlightsDirectory(FlightsDirectory flightsDirectory) {
        this.flightsDirectory = flightsDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public FleetDirectory getFleetDirectory() {
        return fleetDirectory;
    }

    public void setFleetDirectory(FleetDirectory fleetDirectory) {
        this.fleetDirectory = fleetDirectory;
    }
    private FleetDirectory fleetDirectory;
    
}
