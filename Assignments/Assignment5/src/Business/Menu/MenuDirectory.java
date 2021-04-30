/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class MenuDirectory {
    
    private ArrayList<Menu> menuList;

    public MenuDirectory() {
        menuList = new ArrayList();
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }
    
    public void removeRestaurant(Menu m){
        menuList.remove(m);
    }
    
    public Menu createMenu(Menu menu){
        //Menu menu = new Menu();
        //menu.setName(name);
        menuList.add(menu);
        return menu;
    }
    
    public Menu searchMenu(int id){ 
        for (Menu menu : menuList){
            if(menu.getId() == id){
                return menu;
            }
        }
        return null;
    }
    
}
