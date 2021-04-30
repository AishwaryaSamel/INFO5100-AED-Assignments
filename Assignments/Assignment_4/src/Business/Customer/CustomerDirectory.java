/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Aishwarya
 */
public class CustomerDirectory {
    private ArrayList<Customer> cusDis;

    public CustomerDirectory() {
        this.cusDis = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return cusDis;
    }

    public void setCustomerDirectory(ArrayList<Customer> airplaneDirectory) {
        this.cusDis = airplaneDirectory;
    }
    
    public Customer addCustomer(){
        Customer fleet = new Customer();
        cusDis.add(fleet);
        return fleet;
    }
    
    public void removeCustomer(Customer fleet){
        cusDis.remove(fleet);
    }
}
