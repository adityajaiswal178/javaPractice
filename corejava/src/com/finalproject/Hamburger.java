package com.finalproject;

public class Hamburger {
	private int breadRollType;
	private int meat;
	private int carrot;
	private int lettuce;
	private int tomato;
	private String burgerName;
	private int baseprice;
	
	public Hamburger(int breadRollType, int meat, int carrot, int lettuce, int tomato, String burgerName,
			int baseprice) {
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.carrot = carrot;
		this.lettuce = lettuce;
		this.tomato = tomato;
		this.burgerName = burgerName;
		this.baseprice = baseprice;
	}

	public int getBreadRollType() {
		return breadRollType;
	}

	public int getMeat() {
		return meat;
	}

	public int getCarrot() {
		return carrot;
	}

	public int getLettuce() {
		return lettuce;
	}

	public int getTomato() {
		return tomato;
	}

	public String getBurgerName() {
		return burgerName;
	}

	public int getBaseprice() {
		return baseprice;
	}

	public String getFinalPrice(int baseprice,int breadRollType,int meat,int carrot,int lettuce,int tomato,String burgerName){
		int totalPrice=0;
		int breadRollBP= 10;
		int meatBP=45;
		int carrotBP=10;
		int lettuceBP=14;
		int tomatoBP=17;
		
		totalPrice= baseprice+(breadRollBP*breadRollType)+(meat*meatBP)+(carrotBP*carrot)+(lettuceBP*lettuce)+(tomatoBP*tomato);
		return "Total amount of "+burgerName+"="+totalPrice;
	}
	
}
