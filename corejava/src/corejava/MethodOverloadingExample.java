package corejava;

public class MethodOverloadingExample {
	public static double calcFeetAndInchesToCentimeters(int feet, double inches){
		if(feet>=0 && inches>=0 && inches<=12){
			int feetInch= feet*12;
		
			return (feetInch+inches)*2.54;
		}
		return -1;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches){
		if(inches>=0){
			double feet = inches/12;
			return feet;
		}
		return -1;
	}
	public static String getDurationString(int min , int secs){
		if(min>=0 && secs>=0 &&secs<=59){
//			int minSec = secs/60; 
//			int hour= (min+minSec)/60;
//			int remhour = (min+minSec)%60;
//			return hour+"h "+ min+"m "+remhour+"s";
			
			int minHour= min/60;
			int mins= (min%60)+(secs/60); 
			int totalsecs= secs%60;
			
			return minHour+"h "+ mins+"m "+totalsecs+"s";
			
		}
		return "invalid value";
	}
	public static String getDurationString(int secs){
		if (secs>=0){
			int min= secs/60;
			int sec=secs%60;
			System.out.println("minutes "+min);
			System.out.println("sec "+sec);
			return getDurationString(min, sec);
		}
		return "invalid value2";
	}

	public static void main(String[] args) {
		System.out.println(calcFeetAndInchesToCentimeters(5,12));
		System.out.println(calcFeetAndInchesToCentimeters(100));
		System.out.println(getDurationString(300,58));
		System.out.println(getDurationString(6000));
	}

}
