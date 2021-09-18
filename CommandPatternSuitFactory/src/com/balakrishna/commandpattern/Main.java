package com.balakrishna.commandpattern;

public class Main {
	public static void main(String[] args) {
		Suit suit = new Suit();

		SellSuit sellSuit = new SellSuit(suit);

		Ecommerce ecommerce = new Ecommerce();
		ecommerce.addOrder(sellSuit);

		ecommerce.placeOrders();
	}

}
