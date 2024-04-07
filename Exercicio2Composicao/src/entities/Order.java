/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carol
 */
public class Order {
    private Date moment;
    private OrderStatus status;
    
    //associação
    List<OrderItem> itens = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
    }
    
    public void addItem(OrderItem item){
        itens.add(item);
    }
    
    public void removeItem(OrderItem item){
        itens.remove(item);
    }
}
