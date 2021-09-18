package com.balakrishna.commandpattern;

public class SellSuit implements Order{
	private Suit suit;
	
	public SellSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public void execute() {
		suit.sell();
	}

}
