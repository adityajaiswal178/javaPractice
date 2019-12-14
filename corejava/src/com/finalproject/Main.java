package com.finalproject;

public class Main {
	public static void main (String args[]){
		Hamburger hb = new Hamburger(12, 2, 1, 12, 1, "Hamburger", 100);
		System.out.println(hb.getFinalPrice(hb.getBaseprice(), hb.getBreadRollType(), hb.getMeat(), hb.getCarrot(), hb.getLettuce(), hb.getTomato(), hb.getBurgerName()));
	}
}
