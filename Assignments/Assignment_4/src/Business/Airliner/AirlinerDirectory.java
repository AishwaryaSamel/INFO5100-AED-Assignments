/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Customer.CustomerDirectory;
import Business.Fleet.FleetDirectory;
import java.util.ArrayList;

/**
 *
 * @author Sriram
 * 
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDirectory;
    
    private FleetDirectory fleetDirectory;
    private CustomerDirectory customerDirectory;

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

    public AirlinerDirectory(){
        airlinerDirectory = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
    public Airliner addAirliner(){
        Airliner newAirliner = new Airliner();
        airlinerDirectory.add(newAirliner);
        return newAirliner;
    }
    
    public void removeAirliner(Airliner airliner){
        airlinerDirectory.remove(airliner);
    }
    
}
