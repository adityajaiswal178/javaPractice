package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CompareLinkedListEg {
	public static boolean orderedCities(LinkedList<String> city,  String newCity){
		ListIterator<String> iter= city.listIterator();
		while(iter.hasNext()){
			int comparison = iter.next().compareTo(newCity);
			if(comparison==0){
				System.out.println(newCity + " city is already present in the list");
				return false; 
			}else if(comparison >0){
				/*iter.previous();
				iter.add(newCity);
				return true;
			*/}else if(comparison < 0 ){
				iter.previous();
				iter.add(newCity);
				return true;
			}
		}
		
		iter.add(newCity);
		return true;
	}
	public static void main(String[] args) {
		LinkedList<String> city = new LinkedList<String>();
		
		
		orderedCities(city, "12");
		orderedCities(city, "18");
		orderedCities(city, "20");
		orderedCities(city, "32");
		orderedCities(city, "45");
		orderedCities(city, "65");
		
		Iterator<String> iter = city.iterator();
		while(iter.hasNext()){
			System.out.println("Visited city : "+iter.next()) ;
		}

		
	}

}
