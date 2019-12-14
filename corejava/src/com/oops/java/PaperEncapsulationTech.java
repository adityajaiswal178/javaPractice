package com.oops.java;

public class PaperEncapsulationTech {
	private int tonerLevel=100;
	private int pages;
	public PaperEncapsulationTech(int tonerLevel, int pages) {
		if(tonerLevel<=100){
			this.setTonerLevel(tonerLevel);			
		}
		this.setPages(pages);
	}
	
	public String getPrinterType(int pages){
		if(pages<=2){
			return "single printer";
		}
		return "duplex printer";
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}
}
