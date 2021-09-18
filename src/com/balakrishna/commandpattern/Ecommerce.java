package com.balakrishna.commandpattern;
import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	private List<Order> orders = new ArrayList<Order>(); 

	   public void addOrder(Order order){
	      orders.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (Order order : orders) {
	         order.execute();
	      }
	      orders.clear();
	   }

}
