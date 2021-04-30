/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private static int count = 0;
    private int orderNumber;
    
    public Order(){
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
    }
    
   public OrderItem addOrderItem(Product p, int q, double price){
       OrderItem o = new OrderItem();
       o.setProduct(p);
       o.setQuantity(q);
       o.setSalesPrice(price);
       orderItemList.add(o);
       return o;
   }
   public void removeItem(OrderItem orderItem){
       //OrderItem order = new OrderItem();
       orderItemList.remove(orderItem);
   }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
}
