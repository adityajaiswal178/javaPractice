package corejava;

import java.util.Scanner;

public class ReadingInputFromUser {

	public static void main(String[] args) {
		/*Scanner scanner= new Scanner(System.in);
		int count=1;
		int sum=0;
		while(count<=10){
		System.out.println("Enter a number #"+count+": ");
		count++;
		boolean hasNextInt=scanner.hasNextInt();
		
		if(hasNextInt){
			
			int number=scanner.nextInt();
			
			
				sum +=number;
		}else{
			System.out.println("Invalid Number");
		}
			
		}
		System.out.println("sum of all numbers is: "+sum);
		scanner.close();*/
		
		Scanner scanner = new Scanner(System.in);
		int count =0;
		int number=0;
		int min= 0;
		int max =0;
		boolean flag= true;
		while(count <=2){
			
		System.out.println("Enter a number : ");
		if(scanner.hasNextInt()){
			number = scanner.nextInt();
			count++;
			if(flag){
				min=number;
				max=number;
				flag=false;
			}
			if(number>max){
				max=number;
			}
			if(number<min){
				min=number;
			}
				
				
			}
		else{
			System.out.println("Invalid number");			
		}
	}
		System.out.println("Min number: "+min+", "+"Max number :"+max);

	}
}
