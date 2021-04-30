package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        //Employee employee1 = system.getEmployeeDirectory().createEmployee("SysAdmin");
        //Employee employee2 = system.getEmployeeDirectory().createEmployee("DelMan1");
        //Employee employee3 = system.getEmployeeDirectory().createEmployee("RestAdmin1");
        //Customer customer1 = system.getCustomerDirectory().createCustomer("Customer1");
        //Customer customer2 = system.getCustomerDirectory().createCustomer("Customer2");
        Menu m1 = new Menu ();
        m1.setName("chipotle");
        m1.setPrice(11);
        m1.setAvailability(15);
        system.getMenuDirectory().createMenu(m1);
        
        Menu m2 = new Menu ();
        m2.setName("egg and sausage");
        m2.setPrice(11);
        m2.setAvailability(15);
        system.getMenuDirectory().createMenu(m2);
        
        
       // Restaurant restaurant1 = system.getRestaurantDirectory().createRestaurant("Resturant1","Manager1",system.getMenuDirectory());
        //Restaurant restaurant2 = system.getRestaurantDirectory().createRestaurant("Resturant2","Manager2",system.getMenuDirectory());
        
        //DeliveryMan deliveryMan1 = system.getDeliveryManDirectory().createDeliveryMan("DelMan1");
        //DeliveryMan deliveryMan2 = system.getDeliveryManDirectory().createDeliveryMan("DelMan2"); 
        
        UserAccount user1 = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        //UserAccount user2 = system.getUserAccountDirectory().createUserAccount("delman1", "delman1", employee2, new DeliverManRole());
        //UserAccount user3 = system.getUserAccountDirectory().createUserAccount("restad1", "restad1", new AdminRole());
        //UserAccount user4 = system.getUserAccountDirectory().createUserAccount("cust1", "cust1", new CustomerRole());
        //UserAccount user5 = system.getUserAccountDirectory().createUserAccount("cust2", "cust2",  new CustomerRole());
        
        
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
