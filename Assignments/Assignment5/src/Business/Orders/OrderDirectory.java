/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class OrderDirectory {
    
   private ArrayList<OrderItem> orderItemList;

    public OrderDirectory() {
        orderItemList = new ArrayList();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    
   
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    
    public OrderItem createOrderItem(OrderItem orderItem){
        //OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    
    
}
