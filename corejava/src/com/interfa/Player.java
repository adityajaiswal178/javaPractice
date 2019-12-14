package com.interfa;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
 
	private String name;
	private int hitPoints;
	private int strengths;
	private String weapons;
	public Player(String name, int hitPoints, int strengths, String weapons) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strengths = strengths;
		this.weapons = weapons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getStrengths() {
		return strengths;
	}
	public void setStrengths(int strengths) {
		this.strengths = strengths;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hitPoints=" + hitPoints + ", strengths=" + strengths + ", weapons=" + weapons
				+ "]";
	}
	@Override
	public List<String> write() {
		List<String> values= new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, ""+this.hitPoints);
		values.add(2, ""+this.strengths);
		values.add(3, this.weapons);
		
		return values;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues!=null&& savedValues.size()>0){
			this.name=savedValues.get(0);
			this.hitPoints=Integer.parseInt(savedValues.get(1));
			this.strengths=Integer.parseInt(savedValues.get(2));
			this.weapons=savedValues.get(3);
		}
	}
	
}
