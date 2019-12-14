package corejava;

public class WhileStatement {
	public static boolean isEvenNumber(int number){
		if(number%2==0){
			return true;
		}
		return false;
	}
	
	public static int sumDigits(int num){	
			
						
						int sum =0;
						while(num>0){
							
							int number =num%10;
								
							sum+=number;
							
							num/=10;
							
						}
						
						return sum;
				
	}	
	
	public static void main(String[] args) {
		/*int number= 4;
		int finishNum=20;
		int sum=0;
		int count=0;
		while(number<=finishNum){
			number++;
			if(!isEvenNumber(number)){
				continue;
			}
			System.out.println("Even Number "+number);
			sum+=number;
			count ++;
			if (count ==5){
				break;
			}
		}
		System.out.println("Sum of all the numbers : "+sum);*/
		System.out.println(sumDigits(125));
		
	}

}
