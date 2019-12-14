package com.oops.java;

public class Main {

	public static void main(String[] args) {
	/*	Cieling cieling =new Cieling("blue",12);
		Bed bed = new Bed("japanese",12,21);
		Room room = new Room(2,3,4,cieling,bed);
		room.getBed().make();
		room.makeBed();*/
		
		PaperEncapsulationTech paperEnc= new PaperEncapsulationTech(10, 4);
		System.out.println(paperEnc.getPrinterType(paperEnc.getPages())+", Toner level = "+paperEnc.getTonerLevel());
		
	}

}
