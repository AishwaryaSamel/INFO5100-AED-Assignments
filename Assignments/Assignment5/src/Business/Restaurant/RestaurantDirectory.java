        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
   
    public void removeRestaurant(Restaurant r){
        restaurantList.remove(r);
    }
    
    public Restaurant createRestaurant(Restaurant restaurant){
        //Restaurant restaurant = new Restaurant();
//        restaurant.setMenuDirectory(md);
//        restaurant.setName(name);
//        restaurant.setManager(manager);
        
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public Restaurant searchRestaurant(String keyword){
        for (Restaurant restaurant : restaurantList){
            if(restaurant.getName().equals(keyword)){
                return restaurant;
            }
        }
        return null;
    }
    
}
