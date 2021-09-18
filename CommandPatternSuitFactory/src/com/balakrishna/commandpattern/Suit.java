package com.balakrishna.commandpattern;

public class Suit {
	
	private String color = "Blue";
	private String price = "$300";
	private String size = "44L";
	
	 public void sell(){
	      System.out.println("Suit [ Color: "+color+", price: " + price +", size: " + size +" ] sold");
	   }
}
