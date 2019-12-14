package corejava;

public class BaseClassVehicle {

	private int gearChange;
	private int movingSpeed;
	
	public BaseClassVehicle(int gearChange, int movingSpeed){
		this.setGearChange(gearChange);
		this.setMovingSpeed(movingSpeed);
	}

	public int gearIsChanged(int gear){
		return gear;
	}
	
	public int speedIsChanged(int speed){
		return speed;
	}
	public int getGearChange() {
		return gearChange;
	}

	public void setGearChange(int gearChange) {
		this.gearChange = gearChange;
	}

	public int getMovingSpeed() {
		return movingSpeed;
	}

	public void setMovingSpeed(int movingSpeed) {
		this.movingSpeed = movingSpeed;
	}
	
	
}
