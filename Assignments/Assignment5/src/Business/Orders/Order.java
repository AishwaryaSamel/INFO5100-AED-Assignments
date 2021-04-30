/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Menu.Menu;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
//    private static int count = 0;
//    private int orderNumber;

    public Order() {
        orderItemList = new ArrayList();
//        count ++;
//        orderNumber = count;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

//    public int getOrderNumber() {
//        return orderNumber;
//    }

    public OrderItem addOrderItem(Menu menu, int quantity,int price,String status){
        OrderItem o = new OrderItem();
        o.setMenu(menu);
        o.setQuantity(quantity);
        o.setSalesPrice(price);
        o.setStatus(status);
        orderItemList.add(o);
        return o;
    }
        
//    public void setOrderNumber(int orderNumber) {
//        this.orderNumber = orderNumber;
//    }

//    public OrderItem addOrderItem(){
//        OrderItem o = new OrderItem();
//        orderItemList.add(o);
//        return o;
//        
//    }
//    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);           
    }
}
