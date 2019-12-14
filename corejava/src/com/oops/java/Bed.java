package com.oops.java;

public class Bed {
	private String style;
	private int pillow;
	private int sheets;
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getPillow() {
		return pillow;
	}
	public void setPillow(int pillow) {
		this.pillow = pillow;
	}
	public int getSheets() {
		return sheets;
	}
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}
	public Bed(String style, int pillow, int sheets) {
		super();
		this.style = style;
		this.pillow = pillow;
		this.sheets = sheets;
	}
	
	public void make(){
		System.out.println("making");
		}
}
