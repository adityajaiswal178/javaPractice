package com.oops.java;

class Car {
	private boolean engine;
	private int cylinder;
	private int wheels;
	public Car(boolean engine, int cylinder, int wheels) {
		this.engine = engine;
		this.cylinder = cylinder;
		this.wheels = wheels;
	}
	public String startEngine(){
		return "Engine is not started";
		
	}
	public String brake(){
		return "No brakes";
	}
	public String accelerate(){
		return "accelerate";
	}
}
class Maruti extends Car{

	public Maruti(boolean engine, int cylinder, int wheels) {
		super(engine, cylinder, wheels);
	}
	@Override
	public String startEngine(){
		return "Maruti Engine is started";
		
	}
	@Override
	public String brake(){
		return "Maruti stops";
	}
	@Override
	public String accelerate(){
		return "accelerate a maruti";
	}
	
}
class Omni extends Car{

	public Omni(boolean engine, int cylinder, int wheels) {
		super(engine, cylinder, wheels);
	}
	@Override
	public String startEngine(){
		return "Omini Engine not started";
		
	}
	@Override
	public String brake(){
		return "Omini Stops";
	}
	@Override
	public String accelerate(){
		return "Accelerate a omini";
	}
	
}
class Alto extends Car{

	public Alto(boolean engine, int cylinder, int wheels) {
		super(engine, cylinder, wheels);
	}
	@Override
	public String startEngine(){
		return "Alto Engine is started";
		
	}
	@Override
	public String brake(){
		return "Alto Stops";
	}
	@Override
	public String accelerate(){
		return "accelerate a Alto";
	}
	
}

public class MainTest{
	public static void main (String args[]){
		
	}
}