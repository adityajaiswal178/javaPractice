package com.oops.java;

public class Room {
	private int table;
	private int fan;
	private int cupboard;
	private Cieling cieling;
	private Bed bed;
	
	public Room(int table, int fan, int cupboard,Cieling cieling,Bed bed) {
		this.table = table;
		this.fan = fan;
		this.cupboard = cupboard;
		this.cieling=cieling;
		this.bed=bed;
	}
	public Bed getBed(){
		
		return bed;
	}
	public void makeBed(){
		System.out.println("Bed Making");
		bed.make();
	}
	public Cieling getCieling(){
		return cieling;
	}
	public int getTable() {
		return table;
	}
	public void setTable(int table) {
		this.table = table;
	}
	public int getFan() {
		return fan;
	}
	public void setFan(int fan) {
		this.fan = fan;
	}
	public int getCupboard() {
		return cupboard;
	}
	public void setCupboard(int cupboard) {
		this.cupboard = cupboard;
	}
	
	
}
