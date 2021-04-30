/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fleet;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Flights.FlightsDirectory;
import java.util.ArrayList;

/**
 *
 * @author Sriram
 */
public class FleetDirectory {
    
    private ArrayList<Fleet> fleetDiretory;
    
    

    public FleetDirectory() {
        this.fleetDiretory = new ArrayList<Fleet>();
    }
    
    public ArrayList<Fleet> getFleetDirectory() {
        return fleetDiretory;
    }

    public void setFleetDirectory(ArrayList<Fleet> fleetDiretory) {
        this.fleetDiretory = fleetDiretory;
    }
    
    public Fleet addFleet(){
        Fleet fleet = new Fleet();
        fleetDiretory.add(fleet);
        return fleet;
    }
    
    public void removeFleet(Fleet fleet){
        fleetDiretory.remove(fleet);
    }
    
}
