package com.interfa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void saveObjects(ISaveable objectsToSave){
		for(int i=0; i<objectsToSave.write().size(); i++){
			System.out.println("Saving object "+objectsToSave.write().get(i)+ " to storage device");
		}
	}
	public static void loadObjects(ISaveable objectsToLoad){
		ArrayList<String> values=readValues();
		objectsToLoad.read(values) ;
	}
	public static ArrayList<String>readValues(){
		
		ArrayList<String> values= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		boolean quit= false;
		int index=0;
		System.out.println("choose\n 1 to enter a string\n 0 to quit");
		while(!quit){
			System.out.println("choose an option");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice){
			case 0:
				quit=true;
				break;
			case 1:
				System.out.println("Enter a String:");
				String input= sc.nextLine();
				values.add(index,input);
				index++;
				break;
			}
				
					
		}
		return values;
			
	}
	public static void main(String[] args) {
		Player tim= new Player("Tim", 1, 2, "Gun");
		System.out.println(tim.toString());
		saveObjects(tim);
		tim.setHitPoints(4);
		tim.setWeapons("sword");		
		System.out.println(tim);
		saveObjects(tim);
		loadObjects(tim);
		System.out.println(tim);
	}

}
