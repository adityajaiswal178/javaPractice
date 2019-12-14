package com.arraylist.java;

import java.util.ArrayList;

public class MobilePhone {
	ArrayList<String> contacts = new ArrayList<String>();
	
	public void storeContacts(String name){
		if(queryContacts(name)){
			System.out.println("This contact is already exist");
		}else{
			contacts.add(name);
		}
		
	}
	
	public void modifyContacts(int position,String name){
		if(queryContacts(name)){
			System.out.println("This contact is already exist");
		}else{
			contacts.set(position, name);
		}
		
	}
	
	public void removeContacts(int position){
		contacts.remove(position);
	}
	
	public boolean queryContacts(String contact){
		boolean exists=contacts.contains(contact);
		
		if(exists){
			return true;
		}
		return false;
	}
}
