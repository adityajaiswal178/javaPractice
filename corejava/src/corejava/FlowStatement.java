package corejava;

public class FlowStatement {

	public static void printDayOfTheWeek(int day){
		String month=null;
		String months[]= {"Sun","Mon","Tues","wed","Thurs","fri","sat"};


		//System.out.println(months[day]);
		if(day<=months.length){
			System.out.println(months.length);
			month = months[day].toLowerCase();			
		}

		switch(month){
		case "sun": case "mon": case "tues": case "wed": case "thurs": case "fri": case "sat":
			System.out.println(month);
			break;
		default:
			System.out.println("Invalid date");
			break;
		}

	}
	public static void main(String[] args) {
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);
		printDayOfTheWeek(8);
		char charvalue= 'D';

		switch(charvalue){
		case 'A':
			System.out.println("Char A");
			break;
		case 'B':case 'C':case 'D':case 'E':
			System.out.println("Char "+charvalue);
			break;
		default:
			System.out.println("No Colour");
			break;
		}


	}

}
